package com.data.create.mq;

import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.common.RemotingHelper;

/**
 * @author zhougf
 * @desc rocket mq producer
 * @date 2022/12/29 9:30
 */
public class RocketMqProducer {

//    public static String TOPIC = "gunAlm";
    public static String TOPIC = "orderCheckDown";

    public static String NAME_SRV_ADDR = "47.111.69.84:9876";

    public static String TAG = "test_tag";

    public static void main(String[] args) throws Exception {
//        String messageInfo = "{\"equipAddr\":\"3102020220819016\",\"gunNo\":\"1\",\"type\":\"alarm\",\"dataTime\":\"2022-12-21 20:28:42\",\"msg\":{\"type\":\"电桩紧急停止故障\",\"shengmanCode\":8,\"shengmanText\":\"电桩箱门打开\",\"code\":\"020145\",\"dataValue\":0},\"gunId\":\"19999533844\",\"equipNo\":\"544895447\",\"equipId\":\"19999533843\",\"almCode\":\"020145\",\"dataValue\":0}";
//        String messageInfo = "{\"equipId\":\"19999533843\",\"lastWarningTime\":\"\",\"gunNo\":\"1\",\"lastChargepoleStatus\":\"2\",\"chargepoleStatus\":\"5\",\"gunRealStatus\":\"05\",\"pileNo\":\"544895447\",\"lastRealRunStatus\":\"06\",\"equipAddr\":\"3102020220819016\",\"pileId\":\"19999533843\",\"dataTime\":\"2022-12-20 17:32:42\",\"equipType\":\"0202\",\"orgCode\":\"0000000008\",\"operStatus\":\"02\",\"tenantId\":\"\",\"gunId\":\"19999533844\",\"lastOperStatus\":\"01\",\"equipNo\":\"544895447\",\"warningNum\":\"\",\"lastDataTime\":\"2022-12-20 17:15:38\",\"dataSource\":\"3\",\"operatorId\":\"abf2abec8bda491abdd89473b6d47f31\",\"status\":5,\"stationId\":\"3001345040\"}";
        String messageInfo = "{ \n" +
                "  \"OperatorId\":\"MA25CNM38\",\n" +
                "  \"Type\": 3, \n" +
                "  \"BillDownloadUrl\": \"https://mkplat-private.oss-cn-shanghai.aliyuncs.com/energy-bill/confirmed-bills-test.csv?OSSAccessKeyId=yBKaYEZOCKuISd8T&Expires=1673354878&Signature=4yFRAo6FxSdpb0ZA0DaXYZr%2Fyk8%3D\" , \n" +
                "  \"AccountDate\": \"2022-03-29\" \n" +
                "}";
        // 实例化消息生产者Producer
        DefaultMQProducer producer = new DefaultMQProducer("zhougf_test_group");
        // 设置NameServer的地址
        producer.setNamesrvAddr(NAME_SRV_ADDR);
        // 启动Producer实例
        producer.start();
        for (int i = 0; i < 1; i++) {
            // 创建消息，并指定Topic，Tag和消息体
            Message msg = new Message(TOPIC ,
                    TAG ,
                    messageInfo.getBytes(RemotingHelper.DEFAULT_CHARSET)
            );
            // 发送消息到一个Broker
            SendResult sendResult = producer.send(msg);
            // 通过sendResult返回消息是否成功送达
            System.out.printf("%s%n", sendResult);
        }
        // 如果不再发送消息，关闭Producer实例。
        producer.shutdown();
    }
}
