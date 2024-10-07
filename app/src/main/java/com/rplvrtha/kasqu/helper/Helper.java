package com.rplvrtha.kasqu.helper;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.rplvrtha.kasqu/dex-files/0.dex */
public class Helper {
    public String getMD5(String data) {
        try {
            MessageDigest digest = MessageDigest.getInstance("MD5");
            byte[] messageBytes = data.getBytes("UTF-8");
            digest.update(messageBytes);
            byte[] hash = digest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : hash) {
                sb.append(String.format("%02x", Byte.valueOf(b)));
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public String formatMoney(double amount) {
        Locale localeID = new Locale("id", "ID");
        return String.format(localeID, "%,.2f", Double.valueOf(amount));
    }

    public String formatRupiah(double amount) {
        Locale localeID = new Locale("id", "ID");
        return String.format(localeID, "Rp %,.2f", Double.valueOf(amount));
    }

    public String dateFormat(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        return simpleDateFormat.format(date);
    }

    public String dayFormat(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE");
        return simpleDateFormat.format(date);
    }
}
