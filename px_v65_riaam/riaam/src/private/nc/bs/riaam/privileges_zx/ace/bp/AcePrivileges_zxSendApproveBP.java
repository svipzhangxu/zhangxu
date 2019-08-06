package nc.bs.riaam.privileges_zx.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.riaam.privileges.AggDateprivileges_zx;
import nc.vo.pub.VOStatus;
import nc.vo.pub.pf.BillStatusEnum;

/**
 * 标准单据送审的BP
 */
public class AcePrivileges_zxSendApproveBP {
	/**
	 * 送审动作
	 * 
	 * @param vos
	 *            单据VO数组
	 * @param script
	 *            单据动作脚本对象
	 * @return 送审后的单据VO数组
	 */

	public AggDateprivileges_zx[] sendApprove(AggDateprivileges_zx[] clientBills,
			AggDateprivileges_zx[] originBills) {
		for (AggDateprivileges_zx clientFullVO : clientBills) {
			clientFullVO.getParentVO().setAttributeValue("${vmObject.billstatus}",
					BillStatusEnum.COMMIT.value());
			clientFullVO.getParentVO().setStatus(VOStatus.UPDATED);
		}
		// 数据持久化
		AggDateprivileges_zx[] returnVos = new BillUpdate<AggDateprivileges_zx>().update(
				clientBills, originBills);
		return returnVos;
	}
}
