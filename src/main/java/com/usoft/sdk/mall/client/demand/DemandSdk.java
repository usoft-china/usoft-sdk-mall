package com.usoft.sdk.mall.client.demand;

import com.usoft.mall.demand.open.api.protobuf.*;
import com.usoft.sdk.mall.client.BaseSdk;
import com.usoft.sdk.mall.utils.HttpUtil;
import com.usoft.sdk.mall.utils.ProtoBufUtil;

import java.util.Map;

/**
 * @author uas
 * @date 2020/5/21 16:27
 */
public class DemandSdk extends BaseSdk {
    public DemandSdk(String baseUrl, String secretId, String secretKey) {
        super(baseUrl, secretId, secretKey);
    }

    public DemandSdk(String baseUrl, String secretId, String secretKey, int timeout) {
        super(baseUrl, secretId, secretKey, timeout);
    }

    /**
     * 发布需求
     * @param req
     * @return
     * @throws Exception
     */
    public AddDemandResp addDemand(AddDemandReq.Builder req) throws Exception {
		String url = baseUrl + "/openapi/demand/add";
		String paramJson = genSignToJson(req);
		String respJson = HttpUtil.doPost(url, paramJson, timeout);
        AddDemandResp.Builder resp = ProtoBufUtil.toProtoBuf(AddDemandResp.newBuilder(), respJson);
		return resp.build();
	}

    /**
     * 修改需求
     * @param req
     * @return
     * @throws Exception
     */
    public ModifyDemandResp modifyDemand(ModifyDemandReq.Builder req) throws Exception {
		String url = baseUrl + "/openapi/demand/modify";
		String paramJson = genSignToJson(req);
		String respJson = HttpUtil.doPost(url, paramJson, timeout);
        ModifyDemandResp.Builder resp = ProtoBufUtil.toProtoBuf(ModifyDemandResp.newBuilder(), respJson);
		return resp.build();
	}

    /**
     * 首页查询需求
     * @param req
     * @return
     * @throws Exception
     */
    public IndexGetDemandResp indexGetDemand(IndexGetDemandReq.Builder req) throws Exception {
        String url = baseUrl + "/openapi/demand/index/get";
        Map<String, String> params = genSignToMap(req);
        String respJson = HttpUtil.doGet(url, params, timeout);
        IndexGetDemandResp.Builder resp = ProtoBufUtil.toProtoBuf(IndexGetDemandResp.newBuilder(), respJson);
        return resp.build();
    }

    /**
     * v2我的需求查询
     * @param req
     * @return
     * @throws Exception
     */
    public V2MyPageDemandResp v2myPageDemand(V2MyPageDemandReq.Builder req) throws Exception {
        String url = baseUrl + "/openapi/v2/demand/my/get";
        Map<String, String> params = genSignToMap(req);
        String respJson = HttpUtil.doGet(url, params, timeout);
        V2MyPageDemandResp.Builder resp = ProtoBufUtil.toProtoBuf(V2MyPageDemandResp.newBuilder(), respJson);
        return resp.build();
    }

    /**
     * 根据需求code列表查询报价状态
     * @param req
     * @return
     * @throws Exception
     */
    public FindOfferStatusByCodeListResp findOfferStatusByCodeList(FindOfferStatusByCodeListReq.Builder req) throws Exception {
        String url = baseUrl + "/openapi/demand/offer/status/get";
        String paramJson = genSignToJson(req);
        String respJson = HttpUtil.doPost(url, paramJson, timeout);
        FindOfferStatusByCodeListResp.Builder resp = ProtoBufUtil.toProtoBuf(FindOfferStatusByCodeListResp.newBuilder(), respJson);
        return resp.build();
    }

    /**
     * 发布报价
     * @param req
     * @return
     * @throws Exception
     */
    public AddOfferResp addOffer(AddOfferReq.Builder req) throws Exception {
        String url = baseUrl + "/openapi/offer/add";
        String paramJson = genSignToJson(req);
        String respJson = HttpUtil.doPost(url, paramJson, timeout);
        AddOfferResp.Builder resp = ProtoBufUtil.toProtoBuf(AddOfferResp.newBuilder(), respJson);
        return resp.build();
    }

    /**
     * v2卖家分页查询报价单
     * @param req
     * @return
     * @throws Exception
     */
    public V2SellerPageOfferResp v2sellerPageOffer(V2SellerPageOfferReq.Builder req) throws Exception {
        String url = baseUrl + "/openapi/v2/offer/page/get";
        Map<String, String> params = genSignToMap(req);
        String respJson = HttpUtil.doGet(url, params, timeout);
        V2SellerPageOfferResp.Builder resp = ProtoBufUtil.toProtoBuf(V2SellerPageOfferResp.newBuilder(), respJson);
        return resp.build();
    }

    /**
     * 根据需求查报价列表
     * @param req
     * @return
     * @throws Exception
     */
    public FindOfferByDemandResp findOfferByDemand(FindOfferByDemandReq.Builder req) throws Exception {
        String url = baseUrl + "/openapi/offer/by/demand/get";
        Map<String, String> params = genSignToMap(req);
        String respJson = HttpUtil.doGet(url, params, timeout);
        FindOfferByDemandResp.Builder resp = ProtoBufUtil.toProtoBuf(FindOfferByDemandResp.newBuilder(), respJson);
        return resp.build();
    }

    /**
     * 发布定向询价
     * @param req
     * @return
     * @throws Exception
     */
    public AddDirectionalDemandResp addDirectionalDemand(AddDirectionalDemandReq.Builder req) throws Exception {
        String url = baseUrl + "/openapi/demand/directional/add";
        String paramJson = genSignToJson(req);
        String respJson = HttpUtil.doPost(url, paramJson, timeout);
        AddDirectionalDemandResp.Builder resp = ProtoBufUtil.toProtoBuf(AddDirectionalDemandResp.newBuilder(), respJson);
        return resp.build();
    }

    /**
     * 分页查询定向询价单
     * @param req
     * @return
     * @throws Exception
     */
    public PageDirectionalDemandResp pageDirectionalDemand(PageDirectionalDemandReq.Builder req) throws Exception {
        String url = baseUrl + "/openapi/demand/directional/page";
        Map<String, String> params = genSignToMap(req);
        String respJson = HttpUtil.doGet(url, params, timeout);
        PageDirectionalDemandResp.Builder resp = ProtoBufUtil.toProtoBuf(PageDirectionalDemandResp.newBuilder(), respJson);
        return resp.build();
    }
}
