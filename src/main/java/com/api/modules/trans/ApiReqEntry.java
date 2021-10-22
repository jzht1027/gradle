package com.api.modules.trans;

import com.api.modules.dto.*;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName ApiReqEntry
 * @Description
 * @Author
 * @Date 2021/4/8 15:48
 * @Version 1.0
 **/

public class ApiReqEntry {

    @PostMapping
    public String apiEntry (@RequestBody ReqUser reqUser){
        String transCode = reqUser.getTransCode();
        System.out.println("transCode:"+transCode);



        return "true";
    }
}
