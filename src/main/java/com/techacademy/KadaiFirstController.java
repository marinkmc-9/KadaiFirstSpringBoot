package com.techacademy;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KadaiFirstController {

    //指定日の曜日を算定する
    @GetMapping("/dayofweek/{date}")
    public String dispDayOfWeek(@PathVariable String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");//フォーマット
        LocalDate day = LocalDate.parse( date, formatter); //文字列から日付型に変換
        DayOfWeek dayOfWeek = day.getDayOfWeek();//曜日を取得
        String daying = dayOfWeek.toString();//日付型から文字列に変換
        return daying;//ここに曜日が出力
    }

    //足し算 http://localhost:8080/plus/数値1/数値2 メソッド名：calcPlus 実行結果：9（数値1が6、数値2が3の場合
    @GetMapping("/plus/{val1}/{val2}")
    public String calcPlus(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 + val2;
        return "計算結果：" + res;
    }

    //引き算 http://localhost:8080/minus/数値1/数値2 メソッド名：calcMinus 実行結果：3（数値1が6、数値2が3の場合）
    @GetMapping("/minus/{val3}/{val4}")
    public String calcMinus(@PathVariable int val3, @PathVariable int val4) {
        int res = 0;
        res = val3 - val4;
        return "計算結果：" + res;
    }

    //掛け算 http://localhost:8080/times/数値1/数値2 メソッド名：calcTimes 実行結果：18（数値1が6、数値2が3の場合）
    @GetMapping("/times/{val5}/{val6}")
    public String calcTimes(@PathVariable int val5, @PathVariable int val6) {
        int res = 0;
        res = val5 * val6;
        return "計算結果：" + res;
    }

    //割り算 http://localhost:8080/divide/数値1/数値2 メソッド名：calcDivide 実行結果：2（数値1が6、数値2が3の場合）
    @GetMapping("/divide/{val7}/{val8}")
    public String calcDivide(@PathVariable int val7, @PathVariable int val8) {
        int res = 0;
        res = val7 / val8;
        return "計算結果：" + res;
    }

}


