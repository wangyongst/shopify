package com.spring.boot.manager.service.impl;

import com.spring.boot.manager.repository.*;
import com.spring.boot.manager.service.AdminService;
import io.webfolder.cdp.Launcher;
import io.webfolder.cdp.session.Session;
import io.webfolder.cdp.session.SessionFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.ArrayList;

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


    public static void main(String[] args) throws IOException {
        ArrayList<String> command = new ArrayList<>();
        //不显示google 浏览器
        command.add("--headless");
        Launcher launcher = new Launcher();
        try (SessionFactory factory = launcher.launch(command);
             Session session = factory.create()) {
            try {
                String url = "https://yeezysupply.com/products/carpenter-coat-oak?c=%2Fcollections%2Fnew-arrivals";
                // 访问url
                session.navigate(url);
                // 等待页面加载完成，超时时间为30s
                session.waitDocumentReady();
                // 获取JS加载后的页面
                String html = session.getContent();
                session.selectInputText("M");
                System.out.println(html);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
