package com.usoft.sdk.mall.demand;

import com.usoft.mall.demand.open.api.entity.DeployDemand;
import com.usoft.mall.demand.open.api.entity.DeployOffer;
import com.usoft.mall.demand.open.api.entity.ModifyDemand;
import com.usoft.mall.demand.open.api.protobuf.*;
import com.usoft.sdk.mall.client.demand.DemandSdk;
import com.usoft.sdk.mall.utils.ProtoBufUtil;
import org.junit.jupiter.api.Test;

/**
 * @author uas
 * @date 2020/5/21 16:58
 */
public class DemandSdkTest {
    /**
     * 测试地址
     */
    private DemandSdk demandSdk = new DemandSdk("https://malldemandrest.uuzcc.cn", "10042875", "c49f7be6a861461ab951e55030055a5c");

    /**
     * 正式地址
     */
//	private DemandSdk demandSdk = new DemandSdk("http://api-product.usoftchina.com");
    @Test
    public void addDemand() throws Exception {
        AddDemandReq.Builder req = AddDemandReq.newBuilder();
        DeployDemand.Builder builder = DeployDemand.newBuilder();
        builder.setModel("3m");
        builder.setSpec("11");
        builder.setBrand("3m");
        builder.setAmount(100);
        builder.setUuName("优软云");
        builder.setDeadlineDate("2020-05-05");
        req.setDemand(builder);
        req.setUu(1000002821);
        AddDemandResp resp = demandSdk.addDemand(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }

    @Test
    public void modifyDemand() throws Exception {
        ModifyDemandReq.Builder req = ModifyDemandReq.newBuilder();
        ModifyDemand.Builder builder = ModifyDemand.newBuilder();
        builder.setCode("DE200521005234124826");
        builder.setModel("3mmmmm");
        builder.setSpec("11");
        builder.setBrand("3m");
        builder.setAmount(100);
        builder.setUuName("优软云");
        builder.setDeadlineDate("2020-05-05");
        req.setDemand(builder);
        req.setUu(1000002821);
        ModifyDemandResp resp = demandSdk.modifyDemand(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }

    @Test
    public void IndexGetDemandReq() throws Exception {
        IndexGetDemandReq.Builder req = IndexGetDemandReq.newBuilder();
        req.setPageNumber(1);
        req.setPageSize(10);
        IndexGetDemandResp resp = demandSdk.indexGetDemand(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }

    @Test
    public void v2myPageDemand() throws Exception {
        V2MyPageDemandReq.Builder req = V2MyPageDemandReq.newBuilder();
        req.setPageNumber(1);
        req.setPageSize(10);
        V2MyPageDemandResp resp = demandSdk.v2myPageDemand(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }

    @Test
    public void findOfferStatusByCodeList() throws Exception {
        FindOfferStatusByCodeListReq.Builder req = FindOfferStatusByCodeListReq.newBuilder();
        req.addCode("DE200331562071646500");
        req.addCode("DE191211603503446124");
        req.addCode("DE190312236898184270");
        FindOfferStatusByCodeListResp resp = demandSdk.findOfferStatusByCodeList(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }

    @Test
    public void addOffer() throws Exception {
        AddOfferReq.Builder req = AddOfferReq.newBuilder();
        req.setUu(1000002821);
        DeployOffer.Builder builder = DeployOffer.newBuilder();
        builder.setDemandCode("DE200521004438826825");
        builder.setPrice(100);
        builder.setDeadlineDate("2020-05-05");
        req.setOffer(builder);
        AddOfferResp resp = demandSdk.addOffer(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }

    @Test
    public void v2sellerPageOffer() throws Exception {
        V2SellerPageOfferReq.Builder req = V2SellerPageOfferReq.newBuilder();
        req.setPageNumber(1);
        req.setPageSize(10);
        V2SellerPageOfferResp resp = demandSdk.v2sellerPageOffer(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }

    @Test
    public void findOfferByDemand() throws Exception {
        FindOfferByDemandReq.Builder req = FindOfferByDemandReq.newBuilder();
        req.setCode("DE200423762980229715");
        FindOfferByDemandResp resp = demandSdk.findOfferByDemand(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }

    @Test
    public void addDirectionalDemand() throws Exception {
        AddDirectionalDemandReq.Builder req = AddDirectionalDemandReq.newBuilder();
        req.setDirectionalEnuu(50000089);
        req.setBrand("Cypress");
        req.setAmount(1);
        req.setDeadlineDate("2020-05-23");
        req.setModel("AW-NB165NF");
        req.setSpec("片");
        req.setUu(1000002821);
        AddDirectionalDemandResp resp = demandSdk.addDirectionalDemand(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }

    @Test
    public void pageDirectionalDemand() throws Exception {
        PageDirectionalDemandReq.Builder req = PageDirectionalDemandReq.newBuilder();
        req.setPageNumber(1);
        req.setPageSize(10);
        PageDirectionalDemandResp resp = demandSdk.pageDirectionalDemand(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }
}
