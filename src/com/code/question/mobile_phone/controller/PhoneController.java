package com.code.question.mobile_phone.controller;

// 細かく実装する場合、開発環境構築〜各パーツを作成しないとならないため、
// インポートが必要なものはコメントアウト・細かい実装が必要なものはTODOで記載しております。
// また、フォームにコピペする関係上、一つのクラスファイルに記載しています。

//@RequestMapping(path = "/api/stock/phone")
//@RestController
//@JsonApi
public class PhoneController {

//    @PostMapping("/register")
    public RegisterPhoneResponse registerPhone(RegisterPhoneRequest request) {

        // TODO ログイン認証確認
        // TODO 入力パラメータのバリデーション
        // TODO スマートフォン登録状況を確認
        // TODO 登録
        // TODO 処理結果を返却
        return new RegisterPhoneResponse("200", "OK");
    }
}

//@Getter
class RegisterPhoneRequest {

    String imei; // IMEI
    String modelCode; // 機種コード
    String colour; // 色
    boolean isSIMLock; // SIMロック
    String osVersion; // OSバージョン
    double purchasePrice; // 買取価格
    String note; // 備考
}

//@Getter
class RegisterPhoneResponse {

    String code;
    String message;

    public RegisterPhoneResponse(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
