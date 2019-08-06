package nc.impl.pub.ace;

import nc.bs.riaam.privileges_zx.ace.bp.AcePrivileges_zxInsertBP;
import nc.bs.riaam.privileges_zx.ace.bp.AcePrivileges_zxUpdateBP;
import nc.bs.riaam.privileges_zx.ace.bp.AcePrivileges_zxDeleteBP;
import nc.bs.riaam.privileges_zx.ace.bp.AcePrivileges_zxSendApproveBP;
import nc.bs.riaam.privileges_zx.ace.bp.AcePrivileges_zxUnSendApproveBP;
import nc.bs.riaam.privileges_zx.ace.bp.AcePrivileges_zxApproveBP;
import nc.bs.riaam.privileges_zx.ace.bp.AcePrivileges_zxUnApproveBP;
import nc.impl.pubapp.pattern.data.bill.BillLazyQuery;
import nc.impl.pubapp.pattern.data.bill.tool.BillTransferTool;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.riaam.privileges.AggDateprivileges_zx;
import nc.vo.pub.BusinessException;
import nc.vo.pub.VOStatus;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public abstract class AcePrivileges_zxPubServiceImpl {
	// ����
	public AggDateprivileges_zx[] pubinsertBills(AggDateprivileges_zx[] clientFullVOs,
			AggDateprivileges_zx[] originBills) throws BusinessException {
		try {
			// ���ݿ������ݺ�ǰ̨���ݹ����Ĳ���VO�ϲ���Ľ��
			BillTransferTool<AggDateprivileges_zx> transferTool = new BillTransferTool<AggDateprivileges_zx>(
					clientFullVOs);
			// ����BP
			AcePrivileges_zxInsertBP action = new AcePrivileges_zxInsertBP();
			AggDateprivileges_zx[] retvos = action.insert(clientFullVOs);
			// ���췵������
			return transferTool.getBillForToClient(retvos);
		} catch (Exception e) {
			ExceptionUtils.marsh(e);
		}
		return null;
	}

	// ɾ��
	public void pubdeleteBills(AggDateprivileges_zx[] clientFullVOs,
			AggDateprivileges_zx[] originBills) throws BusinessException {
		try {
			// ����BP
			new AcePrivileges_zxDeleteBP().delete(clientFullVOs);
		} catch (Exception e) {
			ExceptionUtils.marsh(e);
		}
	}

	// �޸�
	public AggDateprivileges_zx[] pubupdateBills(AggDateprivileges_zx[] clientFullVOs,
			AggDateprivileges_zx[] originBills) throws BusinessException {
		try {
			// ���� + ���ts
			BillTransferTool<AggDateprivileges_zx> transferTool = new BillTransferTool<AggDateprivileges_zx>(
					clientFullVOs);
			AcePrivileges_zxUpdateBP bp = new AcePrivileges_zxUpdateBP();
			AggDateprivileges_zx[] retvos = bp.update(clientFullVOs, originBills);
			// ���췵������
			return transferTool.getBillForToClient(retvos);
		} catch (Exception e) {
			ExceptionUtils.marsh(e);
		}
		return null;
	}

	public AggDateprivileges_zx[] pubquerybills(IQueryScheme queryScheme)
			throws BusinessException {
		AggDateprivileges_zx[] bills = null;
		try {
			this.preQuery(queryScheme);
			BillLazyQuery<AggDateprivileges_zx> query = new BillLazyQuery<AggDateprivileges_zx>(
					AggDateprivileges_zx.class);
			bills = query.query(queryScheme, null);
		} catch (Exception e) {
			ExceptionUtils.marsh(e);
		}
		return bills;
	}

	/**
	 * ������ʵ�֣���ѯ֮ǰ��queryScheme���мӹ��������Լ����߼�
	 * 
	 * @param queryScheme
	 */
	protected void preQuery(IQueryScheme queryScheme) {
		// ��ѯ֮ǰ��queryScheme���мӹ��������Լ����߼�
	}

	// �ύ
	public AggDateprivileges_zx[] pubsendapprovebills(
			AggDateprivileges_zx[] clientFullVOs, AggDateprivileges_zx[] originBills)
			throws BusinessException {
		AcePrivileges_zxSendApproveBP bp = new AcePrivileges_zxSendApproveBP();
		AggDateprivileges_zx[] retvos = bp.sendApprove(clientFullVOs, originBills);
		return retvos;
	}

	// �ջ�
	public AggDateprivileges_zx[] pubunsendapprovebills(
			AggDateprivileges_zx[] clientFullVOs, AggDateprivileges_zx[] originBills)
			throws BusinessException {
		AcePrivileges_zxUnSendApproveBP bp = new AcePrivileges_zxUnSendApproveBP();
		AggDateprivileges_zx[] retvos = bp.unSend(clientFullVOs, originBills);
		return retvos;
	};

	// ����
	public AggDateprivileges_zx[] pubapprovebills(AggDateprivileges_zx[] clientFullVOs,
			AggDateprivileges_zx[] originBills) throws BusinessException {
		for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
			clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
		}
		AcePrivileges_zxApproveBP bp = new AcePrivileges_zxApproveBP();
		AggDateprivileges_zx[] retvos = bp.approve(clientFullVOs, originBills);
		return retvos;
	}

	// ����

	public AggDateprivileges_zx[] pubunapprovebills(AggDateprivileges_zx[] clientFullVOs,
			AggDateprivileges_zx[] originBills) throws BusinessException {
		for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
			clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
		}
		AcePrivileges_zxUnApproveBP bp = new AcePrivileges_zxUnApproveBP();
		AggDateprivileges_zx[] retvos = bp.unApprove(clientFullVOs, originBills);
		return retvos;
	}

}