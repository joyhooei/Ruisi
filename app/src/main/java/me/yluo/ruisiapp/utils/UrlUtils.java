package me.yluo.ruisiapp.utils;

import me.yluo.ruisiapp.App;

/**
 * Created by free2 on 16-4-1.
 * 返回各种url;
 */
public class UrlUtils {


    public static String getArticleListUrl(int fid, int page, boolean isInner) {
        if (isInner) {
            return "forum.php?mod=forumdisplay&fid=" + fid + "&page=" + page;
        } else {
            return "forum.php?mod=forumdisplay&fid=" + fid + "&page=" + page + "&mobile=2";
        }
    }

    public static String getSingleArticleUrl(String tid, int page, boolean isInner) {
        String url = "forum.php?mod=viewthread&tid=" + tid;
        if (page > 1) {
            url += "&page=" + page;
        }
        if (isInner) {
            return App.getBaseUrl() + url;
        } else {
            return App.getBaseUrl() + url + "&mobile=2";
        }

    }

    public static String getAddFrirndUrl(String uid) {
        if (App.IS_SCHOOL_NET) {
            return "home.php?mod=spacecp&ac=friend&op=add&uid=" + uid + "&inajax=1";
        } else {
            return "home.php?mod=spacecp&ac=friend&op=add&uid=" + uid + "&inajax=1&mobile=2";
        }
    }

    public static String getLoginUrl(boolean isInner) {
        String url = "member.php?mod=logging&action=login";
        if (isInner) {
            return url;
        } else {
            url += "&mobile=2";
        }

        return url;
    }

    public static String getAvaterurls(String urlUid) {
        String uid = urlUid;
        if (urlUid.contains("uid")) {
            uid = GetId.getId("uid=", urlUid);
        }
        return App.getBaseUrl() + "ucenter/avatar.php?uid=" + uid + "&size=small";
    }

    public static String getAvaterurlm(String urlUid) {
        String uid = urlUid;
        if (urlUid.contains("uid")) {
            uid = GetId.getId("uid=", urlUid);
        }
        return App.getBaseUrl() + "ucenter/avatar.php?uid=" + uid + "&size=middle";
    }

    public static String getAvaterurlb(String urlUid) {
        String uid = urlUid;
        if (urlUid.contains("uid")) {
            uid = GetId.getId("uid=", urlUid);
        }
        return App.getBaseUrl() + "ucenter/avatar.php?uid=" + uid + "&size=big";
    }

    public static String getSignUrl() {
        return "plugin.php?id=dsu_paulsign:sign&operation=qiandao&infloat=1&inajax=1";
    }

    public static String getUserHomeUrl(String uid, boolean isInner) {
        if (!isInner) {
            return "home.php?mod=space&uid=" + uid + "&do=profile&mobile=2";
        }
        return "";
    }

    public static String getStarUrl(String id) {
        return "home.php?mod=spacecp&ac=favorite&type=thread&id=" + id + "&mobile=2&handlekey=favbtn&inajax=1";
    }

    public static String getPostUrl(int fid) {
        return App.getBaseUrl() + "forum.php?mod=post&action=newthread&fid=" + fid + "&mobile=2";
    }

    public static String getDeleteReplyUrl() {
        return "forum.php?mod=post&action=edit&extra=&editsubmit=yes&mobile=2&geoloc=&handlekey=postform&inajax=1";
    }
}
