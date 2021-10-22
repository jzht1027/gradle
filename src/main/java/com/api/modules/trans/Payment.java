package com.api.modules.trans;

import com.api.core.inter.Acction;
import com.api.common.util.*;
import com.api.core.inter.TransBaseReqDto;
import com.api.core.inter.TransReqDto;
import com.api.core.inter.TransRspDto;
import com.api.modules.dto.PaymentReq;
import com.api.modules.dto.PaymentRsp;

/**
 * @ClassName HelloController
 * @Description
 * @Author
 * @Date 2021/4/7 9:26
 * @Version 1.0
 **/
@TransService(transCode="Payment",transName="PAY",ReqDto= PaymentReq.class, RspDto= PaymentRsp.class)
public class Payment extends Acction {

    @Override
    public TransRspDto execute(TransBaseReqDto reqDto) throws Exception {

        PaymentReq paymentReq = (PaymentReq)reqDto;
        System.out.println("paymentReq:"+paymentReq.getTransCode());
        return null;
    }


}