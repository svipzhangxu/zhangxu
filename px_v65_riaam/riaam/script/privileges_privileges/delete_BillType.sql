DELETE FROM bd_billtype2 WHERE pk_billtypeid = '0001ZZ1000000000CBVH';
DELETE FROM bd_fwdbilltype WHERE pk_billtypeid = '0001ZZ1000000000CBVH';
DELETE FROM pub_function WHERE pk_billtype = 'MA03';
DELETE FROM pub_billaction WHERE pk_billtypeid = '0001ZZ1000000000CBVH';
DELETE FROM pub_billactiongroup WHERE pk_billtype = 'MA03';
DELETE FROM bd_billtype WHERE pk_billtypeid = '0001ZZ1000000000CBVH';
delete from temppkts;
DELETE FROM sm_rule_type WHERE pk_rule_type = null;
DELETE FROM sm_permission_res WHERE pk_permission_res = null;
DELETE FROM pub_billaction WHERE pk_billaction = '0001ZZ1000000000CBVI';
DELETE FROM pub_billaction WHERE pk_billaction = '0001ZZ1000000000CBVJ';
DELETE FROM pub_billaction WHERE pk_billaction = '0001ZZ1000000000CBVK';
DELETE FROM pub_billaction WHERE pk_billaction = '0001ZZ1000000000CBVL';
DELETE FROM pub_billaction WHERE pk_billaction = '0001ZZ1000000000CBVM';
DELETE FROM pub_billaction WHERE pk_billaction = '0001ZZ1000000000CBVN';
DELETE FROM pub_busiclass WHERE pk_busiclass = '0001ZZ1000000000CBVO';
DELETE FROM pub_busiclass WHERE pk_busiclass = '0001ZZ1000000000CBVP';
DELETE FROM pub_busiclass WHERE pk_busiclass = '0001ZZ1000000000CBVQ';
DELETE FROM pub_busiclass WHERE pk_busiclass = '0001ZZ1000000000CBVR';
DELETE FROM pub_busiclass WHERE pk_busiclass = '0001ZZ1000000000CBVS';
DELETE FROM pub_busiclass WHERE pk_busiclass = '0001ZZ1000000000CBVT';
