package com.jk.pojo;

import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Mapping;
import org.springframework.data.elasticsearch.annotations.Setting;

import java.math.BigDecimal;

@Document(indexName = "travel", type = "travels")
@Setting(settingPath = "/setting/setting.json")
@Mapping(mappingPath = "/mapping/mappering.json")
public class TravelMessage {

    private Integer id;
    private String name;
    private String img;
    private BigDecimal price;
    private String discounts;
    private String placeOfDeparture;
    private String agency;
    private String province;
    private String info;
    private String href;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDiscounts() {
        return discounts;
    }

    public void setDiscounts(String discounts) {
        this.discounts = discounts;
    }

    public String getPlaceOfDeparture() {
        return placeOfDeparture;
    }

    public void setPlaceOfDeparture(String placeOfDeparture) {
        this.placeOfDeparture = placeOfDeparture;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public TravelMessage(Integer id, String name, String img, BigDecimal price, String discounts, String placeOfDeparture, String agency, String province) {
        this.id = id;
        this.name = name;
        this.img = img;
        this.price = price;
        this.discounts = discounts;
        this.placeOfDeparture = placeOfDeparture;
        this.agency = agency;
        this.province = province;
    }

    public TravelMessage() {
    }

    @Override
    public String toString() {
        return "travelMessage{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", img='" + img + '\'' +
                ", price=" + price +
                ", discounts='" + discounts + '\'' +
                ", placeOfDeparture='" + placeOfDeparture + '\'' +
                ", agency='" + agency + '\'' +
                ", province='" + province + '\'' +
                '}';
    }
}
