package com.code.question.mobile_phone.vo;

public class Phone {

    String imei; // IMEI
    Model model; // 機種
    String colour; // 色
    boolean isSIMLock; // SIMロック
    String osVersion; // OSバージョン
    double purchasePrice; // 買取価格
    double SellingPrice; // 販売価格
    String note; // 備考
}

class Model {
    String Code; // 機種コード
    String Name; // 機種名
    Manufacturer manufacturer; // メーカー
    String capacity; // 容量
}

class Manufacturer {
    String Code; // メーカーコード
    String Name; // メーカー名
}
