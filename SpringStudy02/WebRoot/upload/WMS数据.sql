select * from et1_china.tvws_api_suppliermaster d where d.supplierid = 1521--��Ӧ��

select * from tscm_suppliermaster r where r.supplierid = 108

select * from et1_china.tvws_api_productmaster s where s.productid = 179399--��Ʒ

select * from tcmn_workflowtxn  w1  order by w1.entrytime desc 

select * from tcmn_workflowtxn  w where w.workflowtxnid = 64709  for update 

select * from tcmn_spmuser u where u.userid = 3451

select * from tvws_api_productmaster a where a.productid =179489

select * from toaf_orderedproduct op where op.orderstatus < 1003 and op.productid = 649615

select * from tvws_api_productinventory p where p.recordcreatedtime > sysdate-1 order by p.recordcreatedtime desc --�����Ϣ

select * from et1_china.tcmn_api_batchinfo d where batchid = 20180510135924 for update --�޸�������ʱ��

select * from  tvws_api_suppliershiporder l order by l.recordcreatedtime desc --�ɹ�

select * from tvws_api_suppliershipconfirm e where e.colourclass is null order by e.recordcreatedtime desc  --�ɹ��������Ϣ

select * from tvws_api_rtv t order by t.recordcreatedtime desc --�˳��м��

select * from tscm_rtvorderdetails r where r.rtvorderid =98751 for update  --  rtvstatus 1000 -> 1001

select * from tvws_api_rtvconfirm t order by t.recordcreatedtime desc  --�˳�����ȷ����Ϣ

select * from tvws_api_csowhole m order by m.recordcreatedtime desc  -- ���۶���

select *  from tvws_api_csowholeconfirm i where i.shiporderid is null

select * from tvws_api_csowholeconfirm i where i.csostatus = 1000

delete from tvws_api_csowholeconfirm s where s.shiporderid is null

select * from tvws_api_csowholeconfirm c order by c.recordcreatedtime desc --���۶��������Ϣ

select * from tvws_api_returnorderconfirm r order by r.recordcreatedtime desc --���������Ϣ

select * from tvws_api_returnorderwhole m1  order by m1.recordcreatedtime desc

update tvws_api_returnorderwhole z set batchid = '20180503141225' where z.productid < 179415 and z.batchid = '20180503131319'

select * from tvws_api_whtransferorder w order by w.recordcreatedtime desc --�����綩���м��

select * from tvws_api_whtransferodconfirm u order by u.recordcreatedtime desc  --�����綩��ȷ����Ϣ

select * from tscm_rtvorderdetails r order by r.createdtimestamp desc

select * from tscm_productwarehouse  k where k.productid = '179481'

select * from TVWS_TRANSACTIONSETMAPPING WHERE PURPOSE = 'InterWHTransfer-Destination'


-- ������Ϣ
--  lastmodifiedtimestamp
update tscm_suppliermaster  s set s.lastmodifiedtimestamp= to_date('2017-09-25 10:00:00','yyyy-mm-dd hh24:mi:ss')   where s.supplierid = 1521

-- ��Ʒ��Ϣ
update tscm_product p
   set p.lastmodifiedtimestamp = to_date('2017-09-23 10:00:00',
                                         'yyyy-mm-dd hh24:mi:ss'),
       p.createdtimestamp = to_date('2012-06-5 8:59:00',
                                         'yyyy-mm-dd hh24:mi:ss')
 where p.productid in (649581, 649596, 649600, 649615, 993421, 994376, 994568) -- ִ��ʱ�� 2013-06-6 12:40:00



 update TSCM_PRODUCTGENERAL pc set
 pc.lastmodifiedtimestamp =
       to_date('2017-09-23 10:00:00', 'yyyy-mm-dd hh24:mi:ss')
    
 where pc.productid in (649581, 649596, 649600, 649615, 993421, 994376, 994568)-- ִ��ʱ�� 2013-06-6 12:40:00


select * from tscm_product od where od.productid = 950029
