package com.best1.api.mongodb;


import java.util.ArrayList;
import java.util.List;

import com.mongodb.AggregationOutput;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;


 
/**
 * <b>function:</b>MongoDB 简单示例
 * @author hoojo
 * @createDate 2011-5-24 下午02:42:29
 * @file SimpleTest.java
 * @package com.hoo.test
 * @project MongoDB
 * @blog http://blog.csdn.net/IBM_hoojo
 * @email hoojo_@126.com
 * @version 1.0
 */
public class SimpleTest {
 
    public static void main(String[] args) throws Exception {
    	// TODO Auto-generated method stub
    	MongoClient mongoClient = new MongoClient("127.0.0.1", 27017);
    	DB db = mongoClient.getDB("et1");
    	DBCollection collection = db.getCollection("TCRM_CAMPAIGNPLAN");

BasicDBObject document = new BasicDBObject();
document.put("CAMPAIGNNO", "31");
document.put("PARENTCAMPAIGNNO", "");
document.put("SEARCHCRITERIANO", "");
document.put("CAMPAIGNYEAR", "007");
document.put("CAMPAIGNSERIALNO", "31");
document.put("CAMPAIGNTYPECODE", 4104);
document.put("CAMPAIGNOWNER", 5307);
document.put("CAMPAIGNMODE", 4232);
document.put("CAMPAIGNSTATUS", 4120);
document.put("EXCLUSIVEFLAG", "N");
document.put("HASAREACODEDEFINITION", "N");
document.put("VALID", "N");
document.put("CAMPAIGNNAME", "买就送500优惠券");
document.put("CREATEDBY", "5307");
document.put("CREATEDTIMESTAMP", "2007/1/11 18:34:16");
document.put("LASTMODIFIEDBY", "5307");
document.put("LASTMODIFIEDTIMESTAMP", "2007/1/11 18:34:16");

document.put("ESTIMATEDCOST", "");
document.put("ACTUALCOST", "");
document.put("INTENDEDSTATUS", "");
document.put("BOOKLETGROUPNUMBER", "");
document.put("COUPONGROUPNUMBER", 4);
document.put("WORKFLOWID", 32);
document.put("CUSTOMERCRITERIATYPE", "");
document.put("CAMPAIGNSLOGAN", "、好易购保留修改、变更及终止活动办法与条款之权利。");
document.put("CAMPAIGNSUMMARY", "1、活动时间：2006年12月22日-12月31日；  2、双重活动：第一重 买就送500元优惠券，第二重 再抽500元会员卡；  3、500元优惠券分为50元一张，共10张，数量有限，送完为止  4、优惠券限于消费商品单价200元（含）以上单次使用；  5、第二重抽会员卡只抽LIVE时段销售的商品，每款商品抽一名，其中，12/22抽9名幸运会员，12/23-12/31平均每日抽7名幸运会员  6、会员卡面值500元，可抵现金使用，不限使用金额，若消费超出面值金额，可用现金代替；  7、会员卡由专人专函通知，并寄出；  8、消退、取消订单不予参加抽奖；  9、好易购保留修改、变更及终止活动办法与条款之权利。");
document.put("CAMPAIGNID", "P");

document.put("PROCESSEDFLAG", "Y");
document.put("CONDUCTLOTTERYONCEFLAG", "");
document.put("EXCLUDEWINNERSFLAG", "");
document.put("NORMALISEFLAG", "");

document.put("PRNUMBER", "206");
document.put("DOCUMENTLOCATION", "");
document.put("LIVELOTTERYFLAG", "N");
document.put("INCLUDEPRECUSTFLAG", "");


/***
BasicDBObject documentDetail = new BasicDBObject();
documentDetail.put("records", "99");
documentDetail.put("name", "huwenhua");
documentDetail.put("age", "33");
***/

//BasicDBObject documentDetaill = new BasicDBObject();

BasicDBObject f = new BasicDBObject();
f.put("kkkk", "kkk");
BasicDBObject documentDetailk = new BasicDBObject();
documentDetailk.put("records", "000");
documentDetailk.put("name", "0000");
documentDetailk.put("age", "300003");

BasicDBObject documentDetailf = new BasicDBObject();
documentDetailf.put("records", "111");
documentDetailf.put("name", "1111");
documentDetailf.put("age", "1111");

List<DBObject> listDB = new ArrayList<DBObject>();  
listDB.add(documentDetailk);
listDB.add(documentDetailf);
//documentDetaill.put("ffff", documentDetailk);
//documentDetaill.put("ffff", documentDetailf);

f.put("listDB", listDB);

document.put("CAMPAIGNPLAN", f);

collection.insert(document);

DBCursor cursorDoc = collection.find();

            while (cursorDoc.hasNext()) {

                System.out.println(cursorDoc.next());

            }


/**
    	// //创建数据
    	 String department = "Sales";
    	for(int i=1;i<=15;i++)
    	 {
    	 if(i==6)
    	 department = "egineering";
    	 if(i==11)
    	 department = "Human";
    	 BasicDBObject basicDBObject = new BasicDBObject("employee", i).
    	 append("department", department).
    	 append("amount", i*2+1).
    	 append("type", "airfare");
    	 collection.insert(basicDBObject);
    	
    	 }
    	//首先利$match筛选出type为airfate的行
    	DBObject match = new BasicDBObject("$match", new BasicDBObject("type", "airfare") );

    	// 利用$project拼装需要的数据，包含department列、amount列和id列
    	DBObject fields = new BasicDBObject("department", 1);
    	fields.put("amount", 1);
    	fields.put("_id", 0);
    	DBObject project = new BasicDBObject("$project", fields );

    	// 对上面的project利用group分组
    	DBObject groupFields = new BasicDBObject( "_id", "$department");
    	groupFields.put("average", new BasicDBObject( "$avg", "$amount"));
    	DBObject group = new BasicDBObject("$group", groupFields);

    	// run aggregation
    	AggregationOutput output = collection.aggregate( match, project, group );
    	System.out.println(output);
**/
    	mongoClient.close();
    }
}
