package com.api.modules.trans;

import com.api.common.util.RespCode;
import com.api.modules.dto.ReqUser;
import com.api.modules.dto.RespEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName TestController
 * @Description
 * @Author
 * @Date 2021/4/8 17:45
 * @Version 1.0
 **/
@RestController
@RequestMapping("/user")
public class TestController {

//    @PostMapping
//    public RespEntity test(@RequestBody ReqUser reqUser){
//        System.out.println("user"+reqUser.toString());
//        return  new RespEntity(RespCode.SUCCESS, reqUser);
//    }

    @GetMapping("/welcome")
    public  String Home() {
        System.out.println("Hello");
        return "Hello";
    }

    @GetMapping
    public Map to() {
        return new HashMap<String, String>(){{
            put("name", "springboot");
        }};
    }

    @GetMapping("/login")
    public RespEntity login(@RequestBody @Valid ReqUser reqUser) {    //ʹ��reqUserģ�������ܣ�������User��ʵ�� �������ݺ�ʵ��Ľ����
        System.out.println(reqUser.getName());


        return new RespEntity(RespCode.SUCCESS, reqUser);    //���ص���Ӧʵ����忴�½�
    }

}
