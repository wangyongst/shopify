package com.spring.boot.manager.service.impl;

import com.spring.boot.manager.model.URLResult;
import com.spring.boot.manager.repository.*;
import com.spring.boot.manager.service.AdminService;
import com.spring.boot.manager.utils.http.HttpClientUtil;
import com.spring.boot.manager.utils.result.Result;
import com.spring.boot.manager.utils.result.ResultUtil;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

@Service
@SuppressWarnings("All")
@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, rollbackFor = Exception.class, readOnly = false)
public class AdminServiceImpl implements AdminService {

    private static final Logger logger = LogManager.getLogger(AdminServiceImpl.class);

    @Autowired
    private CarturlRepository carturlRepository;
    @Autowired
    private ExampleRepository exampleRepository;
    @Autowired
    private MailinfoRepository mailinfoRepository;
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private SizeRepository sizeRepository;

    @Override
    public Result makeUrl() {
        try {
            String carturl = HttpClientUtil.getCartutl();
            if (StringUtils.isBlank(carturl)) return ResultUtil.errorWithMessage("创建链接失败");
            URLResult urlResult = new URLResult();
            urlResult.setCarturl(carturl);
            urlResult.setBypassurl(carturl + "?previous_step=shipping_method&step=payment_method");
            return ResultUtil.okWithData(urlResult);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ResultUtil.errorWithMessage("创建链接失败");
    }
}
