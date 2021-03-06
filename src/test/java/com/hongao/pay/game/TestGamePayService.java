package com.hongao.pay.game;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSONObject;
import com.hongao.consts.party.PartyIds;
import com.hongao.consts.pay.PayTypes;
import com.hongao.consts.txn.TxnTypes;
import com.hongao.parent.exception.HaBizException;
import com.hongao.pay.dto.PayReq;
import com.hongao.pay.dto.PayResp;
import com.hongao.pay.service.PayService;
import com.hongao.utils.order.GenOrderNoUtil;

/**
 * 
 * @author iTeller_zc
 *
 * @date 2017年12月7日 下午1:34:20
 */
public class TestGamePayService extends HaGamePayBaseTest{
	
	@Autowired
	private PayService payService;
	
	@Test
	public void testAliPay() throws HaBizException{
		PayReq payReq = new PayReq();
		payReq.setAmt(1f);
		payReq.setFrontUrl("localhost:8080/front.shtml");
		payReq.setNotifyUrl("localhost:8080/notify.shtml");
		payReq.setOrderDetail("test");
		payReq.setOrderName("test");
		payReq.setOrderNo(GenOrderNoUtil.genOrderNo(TxnTypes.P));
		payReq.setPayType(PayTypes.ALIPAY);
		payReq.setUserId(1L);
		payReq.setPartyId(PartyIds.HA);
		PayResp payResp = payService.pay(payReq);
		System.out.println(JSONObject.toJSONString(payResp));
	}
	
	@Test
	public void testWxPay() throws HaBizException{
		PayReq payReq = new PayReq();
		payReq.setAmt(1f);
		payReq.setFrontUrl("localhost:8080/front.shtml");
		payReq.setNotifyUrl("localhost:8080/notify.shtml");
		payReq.setOrderDetail("test");
		payReq.setOrderName("test");
		payReq.setOrderNo(GenOrderNoUtil.genOrderNo(TxnTypes.P));
		payReq.setPayType(PayTypes.WXPAY);
		payReq.setUserId(1L);
		payReq.setPartyId(PartyIds.HA);
		PayResp payResp = payService.pay(payReq);
		System.out.println(JSONObject.toJSONString(payResp));
	}
	
	
	@Test
	public void testWxPubPay() throws HaBizException{
		PayReq payReq = new PayReq();
		payReq.setAmt(1f);
		payReq.setFrontUrl("localhost:8080/front.shtml");
		payReq.setNotifyUrl("localhost:8080/notify.shtml");
		payReq.setOrderDetail("test");
		payReq.setOrderName("test");
		payReq.setOrderNo(GenOrderNoUtil.genOrderNo(TxnTypes.P));
		payReq.setPayType(PayTypes.WXPUB);
		payReq.setUserId(1L);
		payReq.setPartyId(PartyIds.HA);
		payReq.setOpenid("oWOeK0njs7kc3wL8esHviYRQvxas");
		PayResp payResp = payService.pay(payReq);
		System.out.println(JSONObject.toJSONString(payResp));
	}
}
