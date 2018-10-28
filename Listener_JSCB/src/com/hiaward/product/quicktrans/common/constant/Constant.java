package com.hiaward.product.quicktrans.common.constant;


/**
 * <p>
 * xBankBass��������
 * </p>
 */
public abstract class Constant
{
    /**
     * �ն����Ͷ���
     */
    public static final int TERMTYPE_SELF_SERVICE = 1; 	// �����ն�
    public static final int TERMTYPE_PDA = 2; 		// PDA�ն�
    public static final int TERMTYPE_TELLER = 3; 	// ��Ա�ն�
    public static final int TERMTYPE_OPERATOR = 4; 	// ����������Ա�ն�
    public static final int TERMTYPE_TC = 5;            // ���ɻ��ն�
    public static final int TERMTYPE_QSTELLER = 6;      // ���ٷ����Ա�ն�
    public static final int TERMTYPE_AUTELLER = 7;   // ��Ȩ��Ա�ն�
    
    public static final int SOCKET_PDA_PORT = 3801; 	// PDA Socketͨ�Ŷ˿�
    public static final int SOCKET_MIBS_PORT = 6000; 	// ��������˿�
    public static final int SOCKET_TIMEOUT = 5; 	// Socketͨ�ų�ʱ����
    //add by buxishuan
    public static final String INQUIRYDETAILACCOUNT = "12";//һ���Բ�ѯ���� add by buxishuan fo ljbnak 2012/11/17
    //public static String ReturnMessage = "";//���ķ�����Ϣ

    /**
     * �������Ͷ���
     */
    public static final int QUEUETYPE_FAST_PROCESS = 1; // ���ٴ������
    public static final int QUEUETYPE_PRIVATE = 2; 	// ��˽����
    public static final int QUEUETYPE_PUBLIC = 3; 	// �Թ�����
    public static final int QUEUETYPE_RESERVE = 4; 	// ԤԼ����
    public static final int QUEUETYPE_VIP = 5; 		// Vip����
    
    /**
     * ��ˮ�ų��ȣ��˴���������23Ϊ��ˮ��ӳ��ʹ��
     */
    public static final int SERIALNUMBER_LENGTH = 6; 		// Vip����
    
    /**
     * ���ݿ��п�ֵ���� 
     */
    public static final String DATABASE_NULL = "N/A";

    /**
     * �Ŷ�״̬����
     */
    public static final int QUEUEITEM_STATUS_WAITTING = 1; 	// �ȴ���
    public static final int QUEUEITEM_STATUS_PROCESSING = 2; 	// ������
    public static final int QUEUEITEM_STATUS_COMPLETED = 3; 	// �����
    public static final int QUEUEITEM_STATUS_CANCELED = 4; 	// ��ȡ��
    public static final int QUEUEITEM_STATUS_TRANSFERED = 5; 	// ת�����
    
    /**
     * ��Ա������½���ܻ�������ݣ���Ȩ����δ�������ݿ� 1����½��2����Ȩ
     */
    public static final String CHECKED_TYPE_TELLERVERIFY = "1";
    public static final String CHECKED_TYPE_AUTHORIZATION = "2";
    /**
     * ������ˮ��ʹ�ú�����ˮ�Ż���ǰ����ˮ��,1Ϊǰ��,2Ϊ����
     */
    public static final String FrontJournalSequence_querytype = "1";
    public static final String BackendJournalSequence_querytype = "2";
    /**
     * ��Ա��¼�������
     */
    public static final String LOGIN_STATUS_SUCCESS = "success";        // ��¼�ɹ�
    public static final String LOGIN_STATUS_FAIL = "fail";              // ��¼ʧ��
    
    /**
     * ����״̬����
     */
    public static final int WINDOW_STATUS_FREE = 1; 		// ����
    public static final int WINDOW_STATUS_PROCESSING = 2; 	// ռ��(������)
    public static final int WINDOW_STATUS_SUSPENDED = 3; 	// ����ͣ����
    public static final int WINDOW_STATUS_CLOSED = 4; 		// �ѹر�

    /**
     * ��Ա״̬����
     */
    public static final int TELLER_STATUS_LOGOUT = 0;           // ��¼
    //modify buxishuan 2012-5-21
    public static final int TELLER_STATUS_LOGIN = 2;       		//��Ա״̬Ϊ��¼ϵͳ
    public static final int TELLER_STATUS_SUSPENDED = 3;        // ��ʱǩ�˷���
    public static final int TELLER_STATUS_RESUME = 4;           // �ָ�����(��ͣ����ķ�����)
    public static final int TELLER_STATUS_REFUNCE = 5;          // �ܾ�����(��ͣ����ǰ���м�״̬)
    //add by buxishuan 2012-5-21
    public static final int TELLER_STATUS_OPEN = 1;				//��Ա��¼״̬Ϊ����

    /**
     * ���۵ȼ�����
     */
    public static final int SCORE_VERY_SATISFIED = 3; 	// �ǳ�����
    public static final int SCORE_SATISFIED = 2; 	// ����
    public static final int SCORE_DISSATISFIED = 1; 	// ������

    /**
     * ԤԼ���Ͷ���
     */
    public static final int RESERVATION_TYPE_COARSE = 1; 	// ��ͨԤԼ
    public static final int RESERVATION_TYPE_FINE = 2; 		// ��ȷԤԼ
    public static final String RESERVATION_NUM_PREFIX = "R-"; 	// ԤԼ��ǰ׺
    public static final int RESERVATION_NUM_LENGTH = 3; 	// ԤԼ�����ֲ��ֳ���

    /**
     * ԤԼ��Ч��״̬����
     */
    public static final int RESERVATION_BEFORE_VALID_PERIOD = -1; 	// ��Ч��֮ǰ
    public static final int RESERVATION_AMONG_VALID_PERIOD = 0; 	// ��Ч��֮��
    public static final int RESERVATION_AFTER_VALID_PERIOD = 1; 	// ��Ч��֮��
    public static final int RESERVATION_COARSE_EXPIRE_DAYS = 7; 	// ��ͨԤԼ��������
    public static final int RESERVATION_MIN_RESERVED_HOURES = 3; 	// ��ԤԼ��С����Сʱ��
    public static final int RESERVATION_FINE_VALID_ACTIVATION_MINUTES = 30; // ��ȷԤԼ������Ч�ڷ�����

    /**
     * Socket��Ϣ֪ͨ����
     */
    public static final int SOCKETMSG_CATEGORY_CALL_LOBBYMANAGER = 1;        // ���д��þ���
    public static final int SOCKETMSG_CATEGORY_VERIFY_IDENTITY = 2;          // �����֤����
    public static final int SOCKETMSG_CATEGORY_LOWER_EVALUATION = 3;         // ������������۹���
    public static final int SOCKETMSG_CATEGORY_VIP_SERVICE = 4;              // Vip�ͻ�ӭ��
    
    /**
     * Socket��Ϣ֪ͨ״̬
     */
    public static final int SOCKETMSG_STATUS_NOT_PROCESSED = 1;       // δ����
    public static final int SOCKETMSG_STATUS_PROCESSED = 2;           // �Ѵ���
    
    /**
     * ���״���״̬
     */
    public static final int STATUS_COMPLETED = 0;           // �Ѵ���
    public static final int STATUS_NOT_COMPLETED = 1;       // δ����
    public static final int STATUS_CANCELED = 2;            // ��ȡ��
    
    /**
     * ǩ���������
     */
    public static final String TELLER_LOGIN_SCENARIONUM = "SC09301010";
    public static final String TELLER_CASHREGISTER = "SC09301023";//���̿�Ǽ�
    public static final String TELLER_CASHREVOCATION = "SC09301025";//���̿��
    

    /**
     * ���״���״̬
     */
    public static final int PARENT_MENU_ID_FOR_TOP_MENUS = -1;          //�����˵�
    public static final int PARENT_MENU_ID_FOR_ALL_MENUS = -2;          //���в˵�
    public static final int PARENT_MENU_ID_FOR_OPERTIONAL_ACTIONS = -3; //
    
    /**
     * ��������������
     */
    public static final String AUTHSCENARIONUM = "SC09001010";//��Ȩ�������
    /**
     * Ĭ�Ϲ��ʱ�����
     */
    public static final String DEFAULT_RECOMMENDAD_QUICKCOUNTERNUM = "-1";
    
    /**
     * IC��Ȧ�������־
     */
    public static final String LOADINGREVERSE = "loadingreverse";
    
    /**
     * XPAHT��ȡ·��
     */
    public static final String XPATHSPLIT = "/";
    
    
    /**
     * TR���������ڷָ�ͷ�����������ֶ�����
     */
    public static final String REQUESTSTATUSCODEDESCSPLIT = ";";

    /**
     * TellerCashRecord���м�¼���
     */
    public static final int FLAG_TELLERCASH = 1;                        // �Զ���Ա���ɻ���ˮ��¼��־
    public static final int FLAG_TELLERDRAWER = 2;                      // �㳮����ˮ��¼��־

    /**
     * TellerCashRecord���м�¼���
     */
    public static final int CAN_PAY_CHANGE = 0;                     //����֧���㳮
    public static final int MAX_PAY_CHANGE_NUM = 10;                //ĳ����ֵ���㳮�����֧������
    
    /**
     * TellerCashRecord���м�¼���
     */
    public static final int TASKTYPE_IN = 0;                        //��ʾTellerCash����"in"����
    public static final int TASKTYPE_OUT = 1;                       //��ʾTellerCash����"out"����
    
    /**
     * TransLogCheckAccount���е���������
     */
    public static final int CHECKACCOUT_TYPE_MIDDAY = 1;          //��ʾ�ռ�����
    public static final int CHECKACCOUT_TYPE_ENDDAY = 2;          //��ʾ��������
    public static final int CHECKACCOUT_MIDDAY_NUM = 5;           //��ʾÿ��ֻ�ܽ���5���ռ�����
    public static final int CHECKACCOUT_ENDDAY_NUM = 1;           //��ʾÿ��ֻ�ܽ���1����������

    /**
     * �㳮�����
     */
    public static final String TOTALAMOUNT_FLAG = "0";              //�ܽ����
    
    /**
     * ҳ��Ĭ�Ϸ��
     */
    public static final String CSS_DEFAULT = "default.css";

    /**
     * �ն˽���״̬
     */
    public static final int CDMSTATUS_NOACT = 0;                 // �ն˽���״̬:δ����
    public static final int CDMSTATUS_PRESENT = 1;               // �ն˽���״̬:���ͳ�
    public static final int CDMSTATUS_DISPFAILED = 2;            // �ն˽���״̬:����ʧ��
    public static final int CDMSTATUS_UNCER = 3;                 // �ն˽���״̬:�����ȷ��
    
    /**
     * ����״̬
     */
    public static final int CWCSTATUS_NEEDLESS = 0;              // ����״̬:δ����
    public static final int CWCSTATUS_OK = 1;                    // ����״̬:�ɹ�
    public static final int CWCSTATUS_FAILED = 2;                // ����״̬:ʧ��
    public static final int CWCSTATUS_UNCER = 3;                 // ����״̬:�����ȷ��
    public static final String IPP_NOT_ACCOUNT = "EGG0862";		 //IPPû�м��� add by buxishuan for ljbank 2012/11/27
    
    /**
     * �촰ϵͳ�����ж���Ľ�����
     * 2012/12/13 buxishuan
     */
    public static final String DEPOSIT_TRANSCODE = "1001";	 
    public static final String WITHDRAW_TRANSCODE = "1002";	 
    public static final String TRANSFER_TRANSCODE = "1003";	 
    
    /**
     * ���˽��
     */
    public static final int CARESULT_NEEDLESS = 0;              // ���˽��:����Ҫ����
    public static final int CARESULT_EVEN = 1;                  // ���˽��:��ƽ
    public static final int CARESULT_EXCESS = 2;                // ���˽��:����
    public static final int CARESULT_SUSPECT = 3;               // ���˽��:������
    
    
    /**
     * �Ծ�����Ϣ��Ϣ������־
     */
    public static final String DELETEWARNINGINFO = "1";              // ɾ��Ԥ����Ϣ
    
    public static final String TELLERTHRESHOLDDEPOSITNUMTYPE = "4";//��Ա�㳮���Ԥ����ֵ
    public static final String TELLERTHRESHOLDWITHDRAWNUMTYPE = "5";//��Ա�㳮ȡ��Ԥ����ֵ
    public static final String QTMTHRESHOLDDEPOSITNUMTYPE = "1";//QTM����Ԥ����ֵ
    public static final String QTMTHRESHOLDWITHDRAWNUMTYPE = "2";//QTMȡ��ȡ�շ�ֵ
    public static final String QTMTHRESHOLDWITHDRAWWARNNUMTYPE = "3";//QTMȡ��Ԥ����ֵ
    
    /**
     * �������ķ��ؽ��
     */
    public static final String TERMRETCODE_SUCCEED = "0000";
    public static final String TERMRETDESC_SUCCEED = "�ɹ�";
    public static final String TERMRETDESCEN_SUCCEED = "Succeed";
    public static final String TERMRETCODE_COMMERR = "0001";
    public static final String TERMRETDESC_COMMERR = "ͨѶ����";
    public static final String TERMRETDESCEN_COMMERR = "Comm error";
    public static final String TERMRETCODE_COMMUNC = "0002";
    public static final String TERMRETDESC_COMMUNC = "ͨѶ�쳣�����׽����ȷ��";
    public static final String TERMRETCODE_ERROR_VALIDATE = "0003";
    public static final String TERMRETDESC_ERROR_VALIDATE = "IC���鿨ʧ��";
    public static final String TERMRETDESCEN_COMMUNC = "Comm uncertain";
    public static final String TERMRETDESCEN_INNERR = "System error";
    public static final String TERMRETDESC_INNERR = "�ڲ�����";
    
    /**
     * add by buxishuan for ljbank 2012/12/15
     */
    public static final String CARDTYPE_OTHER = "20000"; 			// ���п�(��δ��ʶ�𿨺�)
    public static final String CARDTYPE_CREDITCARD = "12000";//���ÿ�
    public static final String CARDTYPE_JIEJICARD = "11000";//������ǿ�
    public static final String CARDTYPE_PASSBOOK = "20001";//���ڴ���
    public static final String CARDTYPE_ONE_PASSBOOK="20002";//����һ��ͨ
    public static final String CARDTYPE_ICCARD = "13000";//IC��
    
    /**
     * �������ͣ������ڹ�������ͷ��
     */
    public static final String SERVICENAME_GETWORKINGKEY = "getWorkingKey";
    public static final String SERVICENAME_GETTERMINFO = "GetTermInfo";
    public static final String SERVICENAME_GETSCENARIOCONFIG = "getScenarioConfigCmd";
    public static final String SERVICENAME_GETSERVICEMENU = "GetServiceMenu";
    public static final String SERVICENAME_VALIDATECARDSERVICE = "ValidateCardService";
    public static final String SERVICENAME_PREPROCESSINFO = "PreprocessInfo";
    public static final String SERVICENAME_QUEUESERVICESELECT = "QueueServiceSelect";
    public static final String SERVICENAME_LISTBRANCHQUEUEINFO = "ListBranchQueueInfo";
    public static final String SERVICENAME_QUEUEPROCESSSMSNOTIFY = "QueueProcessSmsNotify";
    public static final String SERVICENAME_SMSNOTIFY = "SmsNotify";
    public static final String SERVICENAME_PRIVATEBALANCEQUERY = "PrivateBalanceQuery";
    public static final String SERVICENAME_GETTELLERCASHERTERMS = "GetTellerCasherTerms";
    public static final String SERVICENAME_GETTERMSTATUS = "GetTermsStatus";
    public static final String SERVICENAME_TELLERCASHEROPERATE = "TellerCasherOperate";
    public static final String SERVICENAME_CHANGEBOXOPERATE = "ChangeBoxOperate";
    public static final String SERVICENAME_CHANGEBOXINCANCEL = "ChangeBoxIncancel";
    public static final String SERVICENAME_GETTELLERCASHERREALINFO = "GetTellerCashRealInfo";
    public static final String SERVICENAME_GETTHRESHOLDINFOCMD = "getThresholdInfoCmd";

    /**
     * �������ͣ������ڹ�������ͷ��
     * ˵����
     *  ���ڽ����ֱ��ķ���ͬһ�������д���
     *  ��
     *  ������Ҫת�����ͻ��˴����ͻ��˴���һ��ʹ�õ�ʱ����ͷ�е�MessageType�ڵ㣩
     */
    public static final String MESSAGETYPE_TELLERNOTESTASK = "TellerNotesTask";
    
    /**
     * xml·�����ڵ�����
     */
    public static final String XPATH_ROOT = "xBankBass";
    

    /**
     * ��������ͷ
     */
    public static final String XPATH_MESSAGEHEAD_SERVICENAME = "xBankBass/MessageHead/ServiceName";
    public static final String XPATH_MESSAGEHEAD_TRANSACTIONNAME = "xBankBass/MessageHead/TransactionName";
    public static final String XPATH_MESSAGEHEAD_RETCODE = "xBankBass/MessageHead/RetCode";
    public static final String XPATH_MESSAGEHEAD_RETDESC = "xBankBass/MessageHead/RetDesc";
    public static final String XPATH_MESSAGEHEAD_RETDESCEN = "xBankBass/MessageHead/RetDescEn";
    public static final String XPATH_MESSAGEHEAD_MESSAGETYPE = "xBankBass/MessageHead/MessageType";
    public static final String XPATH_MESSAGEHEAD_MAC = "xBankBass/MessageHead/Mac";
    public static final String XPATH_MESSAGEHEAD_TERMNUM = "xBankBass/MessageHead/TermNum";
    public static final String XPATH_MESSAGEHEAD_TERMTYPE = "xBankBass/MessageHead/TermType";
    
    // 2010-9-14 zhouhui
    public static final String XPATH_MESSAGEHEAD_BRANCHNUM = "xBankBass/MessageHead/BranchNum";
    public static final String XPATH_MESSAGEHEAD_SUBBRANCHNUM = "xBankBass/MessageHead/SubBranchNum";
    public static final String XPATH_REQUEST_OPERATORTYPE =  "xBankBass/Request/OperatorTYPE";
    public static final String XPATH_REQUEST_OPERATAMOUNT =  "xBankBass/Request/OperatorAmount";
		
    /**
     * ��ȡ�ն���Ϣ����
     */
    // request
    public static final String XPATH_REQUEST_QTMCLEANTOTALAMOUNT = "xBankBass/Request/QtmCleanTotalAmount";//QTM�������ܽ��
    public static final String XPATH_REQUEST = "xBankBass/Request";
    public static final String XPATH_REQUEST_TELLERNOTES = "xBankBass/Request/TellerNotes";
    public static final String XPATH_REQUEST_NETADDR = "xBankBass/Request/NetAddr";
    public static final String XPATH_REQUEST_PINPADUID = "xBankBass/Request/PinPadUID";
    public static final String XPATH_REQUEST_REFRESHBUF_TARGETOBJECT = "xBankBass/Request/RefreshBuf/TargetObject";
    public static final String XPATH_REQUEST_REFRESHBUF_ID = "xBankBass/Request/RefreshBuf/Id";
    public static final String XPATH_REQUEST_ACTION_FORWARDNAME = "xBankBass/Request/Action/ForwardName";
    public static final String XPATH_REQUEST_PARENTSERVICEID = "xBankBass/Request/ParentServiceId";
    public static final String XPATH_REQUEST_TERMNUM = "xBankBass/Request/TermNum";
    public static final String XPATH_REQUEST_AMOUNT = "xBankBass/Request/Amount";
    public static final String XPATH_REQUEST_OKIAMOUNT = "xBankBass/Request/OKIAmount";
    public static final String XPATH_REQUEST_CASHDRAWERAMOUNT = "xBankBass/Request/CashDrawerAmount";
    public static final String XPATH_REQUEST_TERMTRANSSTATUS = "xBankBass/Request/TermTransStatus";
    public static final String XPATH_REQUEST_ISERVICESTATUS = "xBankBass/Request/iservicestatus";
    public static final String XPATH_REQUEST_TRANSACTIONTSN = "xBankBass/Request/TransactionTsn";
    public static final String XPATH_MESSAGEHEAD_TransactionUUID = "xBankBass/MessageHead/TransactionUUID";
    public static final String XPATH_REQUEST_TRANSTYPE = "xBankBass/Request/TransType";
    public static final String XPATH_REQUEST_CARDMETHOD = "xBankBass/Request/CardMethod";
    public static final String XPATH_REQUEST_SVCSTATUS = "xBankBass/Request/SvcStatus";
    public static final String XPATH_REQUEST_COMMSTATUS = "xBankBass/Request/CommStatus";
    public static final String XPATH_REQUEST_DEVICESTATUS = "xBankBass/Request/DeviceStatus";
    public static final String XPATH_REQUEST_DEVICE_CARDREADER = "xBankBass/Request/DeviceStatus/CardReader";
    public static final String XPATH_REQUEST_DEVICE_PINPAD = "xBankBass/Request/DeviceStatus/PinPad";
    public static final String XPATH_REQUEST_DEVICE_CASHACCEPTOR = "xBankBass/Request/DeviceStatus/CashAcceptor";
    public static final String XPATH_REQUEST_DEVICE_CASHDISPENSER = "xBankBass/Request/DeviceStatus/CashDispenser";
    public static final String XPATH_REQUEST_DEVICE_STATUS = "Status";
    public static final String XPATH_REQUEST_DEVICE_ERRORSTRING = "ErrorString";
    public static final String XPATH_REQUEST_CASSUNITINFO = "xBankBass/Request/CassUnitInfo";
    public static final String XPATH_REQUEST_CASSUNITINFO_RECORDS_RECORD = "xBankBass/Request/CassUnitInfo/Records/Record";
    public static final String XPATH_REQUEST_CASSUNITINFO_RECORDS = "Records";
    public static final String XPATH_REQUEST_CASSUNITINFO_RECORD = "Record";
    public static final String XPATH_REQUEST_CASSUNITINFO_UNITID = "UnitID";
    public static final String XPATH_REQUEST_CASSUNITINFO_TYPE = "Type";
    public static final String XPATH_REQUEST_CASSUNITINFO_CURRENCY = "Currency";
    public static final String XPATH_REQUEST_CASSUNITINFO_VALUE = "Value";
    public static final String XPATH_REQUEST_CASSUNITINFO_INITIALCOUNT = "InitialCount";
    public static final String XPATH_REQUEST_CASSUNITINFO_COUNT = "Count";
    public static final String XPATH_REQUEST_CASSUNITINFO_STATUS = "Status";
    public static final String XPATH_REQUEST_CASSUNITINFO_CASHTOTAL = "CashTotal";
    public static final String XPATH_REQUEST_DESTINATION = "xBankBass/Request/Destination";
    public static final String XPATH_REQUEST_TELLERNOTES_CARDNUM = "xBankBass/Request/TellerNotes/CardNum";
    public static final String XPATH_REQUEST_TELLERNOTES_DATETIME = "xBankBass/Request/TellerNotes/DateTime";
    public static final String XPATH_REQUEST_TELLERNOTES_TYPE = "xBankBass/Request/TellerNotes/Type";
    public static final String XPATH_REQUEST_TELLERNOTES_AMOUNT = "xBankBass/Request/TellerNotes/Amount";
    public static final String XPATH_REQUEST_MAXCOUNT = "xBankBass/Request/MaxCount";
    public static final String XPATH_REQUEST_PAGENO = "xBankBass/Request/PageNo";//��ҳ��ʾʱ��ʾ��ѯ�ڼ�ҳ
    public static final String XPATH_REQUEST_RECORDS_PER_PAGE = "xBankBass/Request/RecordsPerPage";//��ҳ��ʾʱ��ʾÿҳ��¼����Ϊ0��ʾ����ҳ
    public static final String XPATH_REQUEST_TYPE = "xBankBass/Request/Type";
    public static final String XPATH_REQUEST_TRANSACTIONNAME = "xBankBass/Request/TransactionName";
    public static final String XPATH_REQUEST_SCREENHELP = "xBankBass/Request/ScreenHelp";
    public static final String XPATH_REQUEST_SCREENHELP_TYPE = "xBankBass/Request/ScreenHelp/Type";
    public static final String XPATH_REQUEST_SCREENHELP_DATETIME = "xBankBass/Request/ScreenHelp/DateTime";
    public static final String XPATH_REQUEST_SCREENHELP_TASKID = "xBankBass/Request/ScreenHelp/TaskId";
    public static final String XPATH_REQUEST_SCREENHELP_RESULT = "xBankBass/Request/ScreenHelp/Result";
    public static final String XPATH_REQUEST_SCREENHELP_TERMNUM = "xBankBass/Request/ScreenHelp/TermNum";
    public static final String XPATH_REQUEST_CASHDRAWERMONEYFLAG = "xBankBass/Request/CashDrawerMoneyFlag";
    public static final String XPATH_REQUEST_CASHDRAWERMONEY = "xBankBass/Request/CashDrawerMoney";
    public static final String XPATH_REQUEST_DEALJOURNALTYPE = "xBankBass/Request/DealJournalType";
    
    public static final String XPATH_REQUEST_CARDNUM = "xBankBass/Request/CardNum";
    public static final String XPATH_REQUEST_CHANGECARD = "xBankBass/Request/ChangeCard";
    public static final String XPATH_REQUEST_CHANGECARD_TYPE = "xBankBass/Request/ChangeCard/Type";
    public static final String XPATH_REQUEST_CHANGECARD_TASKID = "xBankBass/Request/ChangeCard/TaskId";
    public static final String XPATH_REQUEST_CHANGECARD_TERMNUM = "xBankBass/Request/ChangeCard/TermNum";
    
    
    public static final String XPATH_REQUEST_VALIDATECARDNUM = "xBankBass/Request/ValidateCardNum";
    public static final String XPATH_REQUEST_PAYMENT_TYPE = "xBankBass/Request/PayMent/Type";
    public static final String XPATH_REQUEST_PAYMENT_TASKID = "xBankBass/Request/PayMent/TaskId";
    public static final String XPATH_REQUEST_PAYMENT_TERMNUM = "xBankBass/Request/PayMent/TermNum";
    public static final String XPATH_REQUEST_PAYMENT_ACCOUNT = "xBankBass/Request/PayMent/Account";
    public static final String XPATH_REQUEST_PAYMENT_DATETIME = "xBankBass/Request/PayMent/DateTime";
    public static final String XPATH_REQUEST_PAYMENT_AMOUNT = "xBankBass/Request/PayMent/Amount";
    public static final String XPATH_REQUEST_PAYMENT = "xBankBass/Request/PayMent";
    public static final String XPATH_REQUEST_PAYMENTACCOUNT = "xBankBass/Request/PaymentAccount";
    public static final String XPATH_REQUEST_PAYMENTAMOUNT = "xBankBass/Request/PaymentAmount";
    public static final String XPATH_REQUEST_PAYMENTTYPE = "xBankBass/Request/PaymentType";
    public static final String XPATH_REQUEST_TRACK1 = "xBankBass/Request/Track1";
    public static final String XPATH_REQUEST_OUTCARDNUM = "xBankBass/Request/OutCardNum";
    public static final String XPATH_REQUEST_INCARDNUM = "xBankBass/Request/InCardNum";
    public static final String XPATH_REQUEST_TRANSAMOUNT = "xBankBass/Request/TransAmount";
    public static final String XPATH_REQUEST_TRACK2 = "xBankBass/Request/Track2";
    public static final String XPATH_REQUEST_TRACK3 = "xBankBass/Request/Track3";
    public static final String XPATH_REQUEST_PINBLOCK = "xBankBass/Request/PinBlock";
    public static final String XPATH_REQUEST_TERMSERIALNUM = "xBankBass/Request/TermSerialNum";
    // add by  buxishuan for update card password 2011-12-26
    public static final String XPATH_REQUEST_NEWPINBLOCK = "xBankBass/Request/NewPinBlock";
    public static final String XPATH_MESSAGEHEAD_TYPE = "xBankBass/MessageHead/CardType";
    //��Ȩ��־ add by buxishuan
    public static final String XPATH_MESSAGEHEAD_ISAUTHORIZATION = "xBankBass/MessageHead/IsAuthorization";
  
    
    //���ÿ����� add by ouwanjun 2011-11-08
    public static final String XPATH_REQUEST_TRANSFERTYPE = "xBankBass/Request/TransferType";
    //�����㳮����־����
    public static final String XPATH_REQUEST_STRNODETYPE = "xBankBass/Request/strNodeType";
     
    //masterKey
    public static final String XPATH_REQUEST_MASTERKEY = "xBankBass/Request/MasterKey";
    
    public static final String XPATH_REQUEST_PRINTBANKBOOK = "xBankBass/Request/PrintBankbook";
    public static final String XPATH_REQUEST_PRINTBANKBOOK_TASKID = "xBankBass/Request/PrintBankbook/TaskId";
    public static final String XPATH_REQUEST_PRINTBANKBOOK_TERMNUM = "xBankBass/Request/PrintBankbook/TermNum";
    public static final String XPATH_REQUEST_PRINTBANKBOOK_TYPE = "xBankBass/Request/PrintBankbook/Type";
    
    //ƾ����ӡ
    public static final String XPATH_REQUEST_PRINTPRO = "xBankBass/Request/PrintPro";
    public static final String XPATH_REQUEST_PRINTPRO_TASKID = "xBankBass/Request/PrintPro/TaskId";
    public static final String XPATH_REQUEST_PRINTPRO_TERMNUM = "xBankBass/Request/PrintPro/TermNum";
    public static final String XPATH_REQUEST_PRINTPRO_BRANCHNUM = "xBankBass/Request/PrintPro/BranchNum";
    public static final String XPATH_REQUEST_PRINTPRO_TYPE = "xBankBass/Request/PrintPro/Type";
    
    public static final String XPATH_REQUEST_REPORTLOST = "xBankBass/Request/ReportLost";
    public static final String XPATH_REQUEST_REPORTLOST_TYPE = "xBankBass/Request/ReportLost/Type";
    public static final String XPATH_REQUEST_REPORTLOST_TASKID = "xBankBass/Request/ReportLost/TaskId";
    public static final String XPATH_REQUEST_REPORTLOST_TERMNUM = "xBankBass/Request/ReportLost/TermNum";
    
    public static final String XPATH_REQUEST_CUSTOMTIME_STARTTIME = "xBankBass/Request/StartTime";
    public static final String XPATH_REQUEST_CUSTOMTIME_ENDTIME = "xBankBass/Request/EndTime";
    public static final String XPATH_REQUEST_CUSTOMTIME_EVALUATION = "xBankBass/Request/Evaluation";
    public static final String XPATH_REQUEST_CUSTOMTIME_EVALUATIONTYPE = "xBankBass/Request/EvaluationType";
    public static final String XPATH_REQUEST_IDCARD = "xBankBass/Request/IdCard";
    public static final String XPATH_REQUEST_PAN = "xBankBass/Request/Pan";
    public static final String XPATH_REQUEST_TRANSLOGWITHDRAWID = "xBankBass/Request/TransLogWithdrawId";
    public static final String XPATH_REQUEST_QTMOPERATOR =  "xBankBass/Request/QtmOperator";
    public static final String XPATH_REQUEST_QTMOPERATORMESSAGE =  "xBankBass/Request/QtmOperatorMessage";
 
    public static final String CURRENCY_TYPE_CNY = "CNY";
    
  //xuchunfeng 
    public static final String XPATH_REQUEST_SYSTEMCHECKACCOUNT_TELLERBUSINESSNUM = "xBankBass/Request/SystemCheckAccount/TellerBusinessNum";
    public static final String XPATH_REQUEST_SYSTEMCHECKACCOUNT_TRANSACCOUNT = "xBankBass/Request/SystemCheckAccount/TransAccount";
    public static final String XPATH_REQUEST_SYSTEMCHECKACCOUNT_TRANSDATE= "xBankBass/Request/SystemCheckAccount/TransDate";
    public static final String XPATH_REQUEST_SYSTEMCHECKACCOUNT_OPERATETYPE= "xBankBass/Request/SystemCheckAccount/OperateType";
    public static final String XPATH_REQUEST_SYSTEMCHECKACCOUNT_TELLERNUM= "xBankBass/Request/SystemCheckAccount/TellerNum";
    public static final String XPATH_REQUEST_QTTYPE = "xBankBass/Request/QtType";

  //�Ƽ���������
    public static final String XPATH_REQUEST_RECOMMENDAD_DATETIME= "xBankBass/Request/RecommendAd/DateTime";
    //�ն���ˮ�ϴ�������
    public static final String XPATH_REQUEST_TRACELOGSERVE_TELLERNUM= "xBankBass/Request/TraceLogServer/TellerNum";
    public static final String XPATH_REQUEST_TRACELOGSERVE_BASE64DATA= "xBankBass/Request/TraceLogServer/Base64Data";
    public static final String XPATH_REQUEST_TRACELOGSERVE_SUBBRANCHNUM= "xBankBass/Request/TraceLogServer/SubBranchNum";
    public static final String XPATH_REQUEST_TRACELOGSERVE_DATE = "xBankBass/Request/TraceLogServer/Date";
    public static final String XPATH_REQUEST_TRACELOGSERVE_TERMNUM = "xBankBass/Request/TraceLogServer/TermNum";
    public static final String XPATH_REQUEST_BUSINESSWATERNUM = "xBankBass/Request/BusinessWaterNum";
    // response
    public static final String XPATH_RESPONSE = "xBankBass/Response";
    public static final String XPATH_RESPONSE_RETCODE = "xBankBass/Response/RetCode";
    public static final String XPATH_RESPONSE_TERMNUM = "xBankBass/Response/TermNum";
    public static final String XPATH_RESPONSE_BRANCHNUM = "xBankBass/Response/BranchNum";
    public static final String XPATH_RESPONSE_SUBBRANCHNUM = "xBankBass/Response/SubBranchNum";
    public static final String XPATH_RESPONSE_PARENTADDR = "xBankBass/Response/ParentAddr";
    public static final String XPATH_RESPONSE_TELLERNUM = "xBankBass/Response/TellerNum";
    public static final String XPATH_RESPONSE_TERMTYPE = "xBankBass/Response/TermType";
    public static final String XPATH_RESPONSE_TERMSTATUS = "xBankBass/Response/TermStatus";
    public static final String XPATH_RESPONSE_UISTYLE = "xBankBass/Response/UiStyle";
    public static final String XPATH_RESPONSE_UIMENUSTYLE = "xBankBass/Response/UiMenuStyle";
    public static final String XPATH_RESPONSE_PINKEY = "xBankBass/Response/PinKey";
    public static final String XPATH_RESPONSE_PINVALIDATEKEY = "xBankBass/Response/PinValidateKey";
    public static final String XPATH_RESPONSE_MACKEY = "xBankBass/Response/MacKey";
    public static final String XPATH_RESPONSE_MASTERKEY = "xBankBass/Response/MasterKey";
    public static final String XPATH_RESPONSE_SECURITYMODULE = "xBankBass/Response/SecurityModule";
    public static final String XPATH_RESPONSE_ORIGINALMASTERKEY = "xBankBass/Response/OriginalMasterKey";
    public static final String XPATH_RESPONSE_MASTERKEYUPDATESTATE = "xBankBass/Response/MasterKeyUpdateState";
    public static final String XPATH_RESPONSE_PARENTID = "xBankBass/Response/ParentId";
    public static final String XPATH_RESPONSE_ASSIGNTELLER = "xBankBass/Response/AssignTeller";
    public static final String XPATH_RESPONSE_LISTENPORT = "xBankBass/Response/ListenPort";
    public static final String XPATH_RESPONSE_VMODULE = "xBankBass/Response/vModule";
    public static final String XPATH_RESPONSE_TRANSLOGWITHDRAWID = "xBankBass/Response/TransLogWithdrawId";
    public static final String XPATH_RESPONSE_TRANSLOGDEPOSITID = "xBankBass/Response/TransLogDepositId";
    public static final String XPATH_RESPONSE_TERMTSN = "xBankBass/Response/TermTsn";
    public static final String XPATH_RESPONSE_TYPE = "xBankBass/Response/Type";
    public static final String XPATH_RESPONSE_ACCOUNTTYPE = "xBankBass/Response/AccountType";
    public static final String XPATH_RESPONSE_CUSTOMERNAME = "xBankBass/Response/CustomerName";
    public static final String XPATH_RESPONSE_REVERSE_STATUS = "xBankBass/Response/ReverseStatus";//����
    public static final String XPATH_RESPONSE_ISMASTERKEYUPDATE = "xBankBass/Response/IsMasterKeyUpdate";
    public static final String XPATH_RESPONSE_COREDATE = "xBankBass/Response/CoreDate";
    public static final String XPATH_RESPONSE_COREWATERNUM = "xBankBass/Response/CoreWaterNum";
    public static final String XPATH_RESPONSE_ADDCASHSTATUS = "xBankBass/Response/addcashstatus";
    //���ݷ���״̬�ж����������˻��Ǳ��ض��� add by buxishuan 2012-7-2
    public static final String XPATH_RESPONSE_CHECKACCOUNT_STATUS = "xBankBass/Response/CheckAccount/Status";
    //������������ˣ��ж������Ƿ��ƽ
    public static final String XPATH_RESPONSE_CHECKACCOUNT_RESULT = "xBankBass/Response/CheckAccount/Result";
    // Add for CITIC ������Կ���
    public static final String XPATH_RESPONSE_IRET = "xBankBass/Response/IRet";
    //���ؽ�����ˮ��
    public static final String XPATH_RESPONSE_TRANSACTIONTSN = "xBankBass/Response/TransactionTsn";

    public static final String XPATH_RESPONSE_ACCOUNTS = "xBankBass/Response/Accounts";
    public static final String XPATH_RESPONSE_ACCOUNTS_VALUE = "xBankBass/Response/Accounts/Value";
    public static final String XPATH_RESPONSE_ACCOUNTS_CURRENCY = "xBankBass/Response/Accounts/Currency";
    public static final String XPATH_RESPONSE_ACCOUNTS_OUT = "xBankBass/Response/Accounts/Out";
    public static final String XPATH_RESPONSE_ACCOUNTS_IN = "xBankBass/Response/Accounts/In";
    
    public static final String XPATH_RESPONSE_RECORDS_RECORD_VALUE = "Value";
    public static final String XPATH_RESPONSE_RECORDS_RECORD_TOTALAMOUNT = "TotalAmount";
    public static final String XPATH_RESPONSE_RECORDS_RECORD_DINAMOUNT = "Dinamount";
    public static final String XPATH_RESPONSE_RECORDS_RECORD_WORKDATE = "Workdate";
    
    public static final String XPATH_RESPONSE_TOTALNUM = "xBankBass/Response/TotalNum";
	public static final String XPATH_RESPONSE_CT100 = "xBankBass/Response/ct100";
    public static final String XPATH_RESPONSE_CT50 = "xBankBass/Response/ct50";
    public static final String XPATH_RESPONSE_CT10 = "xBankBass/Response/ct10";
    public static final String XPATH_RESPONSE_ADDAMOUNT = "xBankBass/Response/addAmount";
    public static final String XPATH_RESPONSE_TXFAMOUNT = "xBankBass/Response/txfAmount";
    
    public static final String XPATH_REQUEST_EXPHANDLE = "xBankBass/Request/ExpHandle";
    public static final String XPATH_REQUEST_AUTHORIZATION = "xBankBass/Request/Authorization";
    public static final String XPATH_REQUEST_AUTHORIZATION_TYPE = "xBankBass/Request/Authorization/Type";
    public static final String XPATH_REQUEST_AUTHORIZATION_TRANSACTION = "xBankBass/Request/Authorization/TransAction";
    public static final String XPATH_REQUEST_AUTHORIZATION_RESULT = "xBankBass/Request/Authorization/Result";
    public static final String XPATH_REQUEST_AUTHORIZATION_TERMNUM = "xBankBass/Request/Authorization/TermNum";
    public static final String XPATH_REQUEST_TASKID ="xBankBass/Request/TaskId";
    public static final String XPATH_REQUEST_AUTHORIZATION_TASKID = "xBankBass/Request/Authorization/TaskId";
    public static final String XPATH_REQUEST_AUTHORIZATION_TELLERNUM = "xBankBass/Request/Authorization/TellerNum";
    public static final String XPATH_REQUEST_AUTHORIZATION_CASENUM = "xBankBass/Request/Authorization/CaseNum";
    public static final String XPATH_REQUEST_AUTHORIZATION_CURRENCY = "xBankBass/Request/Authorization/Currency";
    public static final String XPATH_REQUEST_AUTHORIZATION_AMOUNT = "xBankBass/Request/Authorization/Amount";
    public static final String XPATH_REQUEST_AUTHORIZATION_FLAG = "xBankBass/Request/Authorization/Flag";
    public static final String XPATH_REQUEST_AUTHORIZATION_MEMO = "xBankBass/Request/Authorization/Memo";
    public static final String XPATH_REQUEST_AUTHORIZATION_REASON = "xBankBass/Request/Authorization/Reason";
    //����50 100 �������
    public static final String XPATH_REQUEST_Denomination_50 = "xBankBass/Request/Denomination_50";
    public static final String XPATH_REQUEST_Denomination_100 = "xBankBass/Request/Denomination_100";
    public static final String XPATH_REQUEST_Denomination_10 = "xBankBass/Request/Denomination_10";
    
    // ƾ����ӡ�����ڵ�
    public static final String XPATH_RESPONSE_ANSNO = "xBankBass/Response/AnsNo";// �����
    public static final String XPATH_RESPONSE_SEARCHNO = "xBankBass/Response/SearchNo";// ������
    public static final String XPATH_RESPONSE_ACQUIRERNO = "xBankBass/Response/AcquirerNo";// �����к�
    public static final String XPATH_RESPONSE_REQDATE = "xBankBass/Response/strReqDate";// �����ĵ�ʱ��
    
    public static final String XPATH_RESPONSE_PARENTIDID = "xBankBass/Response/ParentIdId";//��Ա����
//xuchunfeng
    public static final String XPATH_RESPONSE_SYSTEMCHECKACCOUNT_RETURNSTATE = "xBankBass/Response/SystemCheckAccount/ReturnState";
    public static final String XPATH_RESPONSE_SYSTEMCHECKACCOUNT_SYSTEMTRANSACCOUNT = "xBankBass/Response/SystemCheckAccount/SystemTransAccount";
    
    public static final String XPATH_RESPONSE_TRANSINSTITUTIONNAME =  "xBankBass/Response/TransInstitutionName";
    public static final String XPATH_REQUEST_TRANSINSTITUTIONNUM = "xBankBass/Request/TransInstitutionNum";
    
    /**
     * forwordaction������xml�ֶ��������ڷ�������תҳ��ʱ�����ݱ��浽HttpRequest��ָ��������
     */
    public static final String FORWARDACTION_REQUEST_XMLTEXT = "xmltext";

    /**
     * ��������
     */
    // request
    public static final String XPATH_REQUEST_PHONENUM = "xBankBass/Request/PhoneNum";
    public static final String XPATH_REQUEST_MINWAITNUM = "xBankBass/Request/MinWaitNum";

    /**
     * Ԥ������
     */
    // response
    public static final String XPATH_RESPONSE_QUEUENUM = "xBankBass/Response/QueueNum";
    public static final String XPATH_RESPONSE_PROMPTINFO = "xBankBass/Response/PromptInfo";
    
    public static final String XPATH_RESPONSE_BUTTON = "xBankBass/Response/Button";
    public static final String XPATH_RESPONSE_BUTTON_NAME = "Name";
    public static final String XPATH_RESPONSE_BUTTON_NAMEEN = "NameEn";
    public static final String XPATH_RESPONSE_BUTTON_SERVICE_NAME = "ServiceName";
    public static final String XPATH_RESPONSE_BUTTON_POSITION = "ButtonPosition";

    /**
     * ��¼�����
     */
    // response
    public static final String XPATH_RESPONSE_RECORDS = "xBankBass/Response/Records";
    public static final String XPATH_RESPONSE_RECORD = "xBankBass/Response/Records/Record";
    public static final String XPATH_RESPONSE_RECORDRESULT_THS = "xBankBass/Response/RecordResult/ths";
    public static final String XPATH_RESPONSE_RECORDRESULT_THSEN = "xBankBass/Response/RecordResult/thsEN";
    public static final String XPATH_RESPONSE_RECORDRESULT_FIELDNAMES = "xBankBass/Response/RecordResult/FieldNames";
    public static final String XPATH_RESPONSE_RECORDRESULT = "xBankBass/Response/RecordResult";
    public static final String XPATH_RESPONSE_RECORDRESULT_RECORDS_RECORD = "xBankBass/Response/RecordResult/Records/Record";
    public static final String XPATH_RESPONSE_RECORDRESULT_ENABLE = "xBankBass/Response/RecordResult/Enable";
    public static final String XPATH_RESPONSE_RECORDRESULT_SERVICENAME = "xBankBass/Response/RecordResult/ServiceName";
    public static final String XPATH_RESPONSE_RECORDRESULT_RETURN = "xBankBass/Response/RecordResult/Return";

    /**
     * �˵�����
     */
    // request
    public static final String XPATH_REQUEST_PARENTMENUID = "xBankBass/Request/ParentMenuId";
    //��Թ�Ա��UI�����޸�
    public static final String XPATH_REQUEST_MENULEVEL = "xBankBass/Request/MenuLevel";
    //��������
    public static final String XPATH_REQUEST_TRANSNAME = "xBankBass/Request/TransName";
    
    // response
    public static final int SHORTCUTMENU = 1;
    public static final int NOTSHORTCUTMENU = 0;
    public static final String XPATH_RESPONSE_MAINMENU = "xBankBass/Response/MainMenu";
    public static final String XPATH_RESPONSE_MENU = "xBankBass/Response/Menu";
    public static final String XPATH_RESPONSE_MENU_ID = "Id";
    public static final String XPATH_RESPONSE_MENU_MENUID = "MenuId";
    public static final String XPATH_RESPONSE_MENU_NAME = "Name";
    public static final String XPATH_RESPONSE_MENU_NOTE = "Note";
    public static final String XPATH_RESPONSE_MENU_NAMEEN = "NameEn";
    public static final String XPATH_RESPONSE_MENU_URL = "Url";
    public static final String XPATH_RESPONSE_MENU_TRANSID = "TransId";
    public static final String XPATH_RESPONSE_MENU_TRANSNAME = "TransName";
    public static final String XPATH_RESPONSE_MENU_SERVICENAME = "ServiceName";
    public static final String XPATH_RESPONSE_MENU_PARENTMENUID = "ParentMenuId";
    public static final String XPATH_RESPONSE_MENU_TRANSIMG = "TransImg";
    public static final String XPATH_RESPONSE_MENU_MULTIAPPSELECT = "MultiAppSelect";
    public static final String XPATH_RESPONSE_MENU_IMGPOSITION = "ImgPosition";
    public static final String XPATH_RESPONSE_MENU_MENUUSESTATUS = "MenuUseStatus";
    //��Ӱ�ť��������(���ڼ�����������ת�� �� ���ÿ������¼��־) add by ouwanjun 2011-12-30 
    public static final String TRANSACCOUNT = "transAccount";//ת��
    public static final String CREDITCARDPAY = "creditcardpay";//���ÿ�ת�˻���

    public static final String XPATH_RESPONSE_RECOMMENDMENU_RECOMMENDTRANSNAME = "RecommendTransName";//�Ƽ���������
    public static final String XPATH_RESPONSE_RECOMMENDMENU = "xBankBass/Response/RecommendMenu";//�Ƽ����ײ˵�
    public static final String XPATH_RESPONSE_RECOMMENDMENU_MENU = "Menu";
    
    public static final String XPATH_RESPONSE_RECOMMENDAD_IMAGEURL = "xBankBass/Response/RecommendAd/ImageUrl";//�Ƽ�����·��
    
    /**
     * ֧�з���
     */
    public static final String XPATH_RESPONSE_SUBBRANCH = "xBankBass/Response/SubBranch";
    public static final String XPATH_RESPONSE_SUBBRANCH_NUM = "Number";
    public static final String XPATH_RESPONSE_SUBBRANCH_NAME_ = "Name";
    
    /**
     * ���׷���
     */
    // request
    public static final String XPATH_REQUEST_TRANS_ID = "xBankBass/Request/Trans/TransId";
    public static final String XPATH_REQUEST_TRANS_NAME = "xBankBass/Request/Trans/TransName";
    public static final String XPATH_REQUEST_TRANSINFO_ID = "xBankBass/Request/TransInfo/Id";

    // response
    public static final String XPATH_RESPONSE_TRANSINFO = "xBankBass/Response/TransInfo";
    public static final String XPATH_RESPONSE_TRANSINFO_ID = "xBankBass/Response/TransInfo/Id";
    public static final String XPATH_RESPONSE_TRANS_ID = "xBankBass/Response/Trans/Id";
//    public static final String XPATH_RESPONSE_TRANS_NAME = "xBankBass/Response/TransName";
    public static final String XPATH_RESPONSE_TRANS_DETAILITEMS = "DetailItems";

    /**
     * ���з���
     */
    // request
    public static final String XPATH_REQUEST_SUBBRANCHNUM = "xBankBass/Request/SubBranchNum";
    public static final String XPATH_REQUEST_QUEUE_ID = "xBankBass/Request/QueueId";
    public static final String XPATH_REQUEST_QUEUE_TYPE = "xBankBass/Request/QueueType";
    public static final String XPATH_REQUEST_QUEUEITEM_ID = "xBankBass/Request/QueueItemId";
    public static final String XPATH_REQUEST_QUEUEITEM_NUM = "xBankBass/Request/QueueItemNum";
    public static final String XPATH_RESPONSE_PRINTINFO = "xBankBass/Response/PrintInfo";

    // response
    public static final String XPATH_RESPONSE_QUEUE = "xBankBass/Response/Queue";
    public static final String XPATH_RESPONSE_QUEUE_ID = "Id";
    public static final String XPATH_RESPONSE_QUEUE_NAME = "Name";
    public static final String XPATH_RESPONSE_QUEUE_Number = "Number";
    public static final String XPATH_RESPONSE_QUEUEITEM_ID = "QueueItemId";
    public static final String XPATH_RESPONSE_QUEUEITEM_NUM = "QueueItemNum";

    public static final String XPATH_RESPONSE_SUBBRANCH_NAME = "xBankBass/Response/SubBranchName";
    public static final String XPATH_RESPONSE_QUEUE_AMOUNTOFPEOPLEINWAITING = "xBankBass/Response/AmountOfPeopleInWaiting";
    public static final String XPATH_RESPONSE_QUEUE_AMOUNTOFTIMEINWAITING = "xBankBass/Response/AmountOfTimeInWaiting";
    
    public static final String XPATH_RESPONSE_QUEUENAME = "xBankBass/Response/QueueName";
    public static final String XPATH_RESPONSE_QUEUEITEMNUM = "xBankBass/Response/QueueItemNum";
    public static final String XPATH_RESPONSE_AMOUNTOFPEOPLEINWAITING = "xBankBass/Response/AmountOfPeopleInWaiting";
    public static final String XPATH_RESPONSE_AMOUNTOFTIMEINWAITING = "xBankBass/Response/AmountOfTimeInWaiting";
    


    public static final String MSG_TRANS_NAME = "��ѡ��Ľ��ף�";
    public static final String MSG_AMOUNTOFPEOPLEINWAITING = "����Ҫ�ȴ���������";
    public static final String MSG_AMOUNTOFTIMEINWAITING = "����Ҫ�ȴ���ʱ�䣺";
    public static final String MSG_QUEUEITEM_NOT_FOUND = "ϵͳδ�ҵ���֮ǰ���ŶӺţ���ȷ�������ŶӺ�������ȷ";
    public static final String MSG_RESTORE_QUEUING = "�������⹫���ƽк���Ϣ����Ҫ�ٴδ���к�";

    //���
    public static final String XPATH_RESPONSE_DEPOSITNUM = "xBankBass/Response/DepositNum";
    public static final String XPATH_RESPONSE_DEPOSITACCOUNT = "xBankBass/Response/DepositAccount";
    public static final String XPATH_RESPONSE_WITHDRAWNUM = "xBankBass/Response/WithdrawNum";
    public static final String XPATH_RESPONSE_WITHDRAWACCOUNT = "xBankBass/Response/WithdrawAccout";
    public static final String XPATH_REQUEST_SHOWINVENTORY_TELLERNUM = "xBankBass/Request/ShowInventory/TellerNum";
    public static final String XPATH_REQUEST_SHOWINVENTORY_DATETIME = "xBankBass/Request/ShowInventory/datetime";
    public static final String XPATH_REQUEST_SHOWINVENTORY_TERMNUM = "xBankBass/Request/ShowInventory/TermNum";
    public static final String XPATH_REQUEST_SHOWINVENTORY = "xBankBass/Request/ShowInventory";
    /**
     * ԤԼ����
     */
    // request 
    public static final String XPATH_REQUEST_RESERVE_TYPE = "xBankBass/Request/ReserveType";
    public static final String XPATH_REQUEST_RESERVE_TIME = "xBankBass/Request/ReserveTime";
    public static final String XPATH_REQUEST_RESERVATION_NUM = "xBankBass/Request/ReservationNum";
    
    // response
    public static final String XPATH_RESPONSE_RESERVATION_NUM = "xBankBass/Response/Reservation/Num";
    public static final String XPATH_RESPONSE_RESERVATION_STARTTIME = "xBankBass/Response/Reservation/StratTime";
    public static final String XPATH_RESPONSE_RESERVATION_EXPIRETIME = "xBankBass/Response/Reservation/ExpireTime";
    public static final String MSG_RESERVATION_NUM = "����ԤԼ���ǣ�";
    public static final String MSG_RESERVATION_STARTTIME = "����ԤԼ��Ч�ڿ�ʼʱ�䣺";
    public static final String MSG_RESERVATION_EXPIRETIME = "����ԤԼ��Ч�ڹ���ʱ�䣺";
    public static final String MSG_RESERVATION_NOT_FOUND = "��������ԤԼ�������Ƿ���ȷ";
    public static final String MSG_BEFORE_VALID_PERIOD = "��δ������ԤԼ����ʱ��";
    public static final String MSG_AFTER_VALID_PERIOD = "����ԤԼ�ѹ���";
    public static final String MSG_RESERVATION_ALREADY_ACTIVATED = "����ԤԼ�Ѿ�������";
    
    // ��Ա���� 
    public static final String  XPATH_REQUEST_FINGERDATA =  "xBankBass/Request/FingerData";
    public static final String  XPATH_REQUEST_TRANSACTIONPWD =  "xBankBass/Request/TransactionPwd";
    public static final String XPATH_REQUEST_TELLER_NUM = "xBankBass/Request/TellerNum";
    
    public static final String XPATH_REQUEST_DEVICETYPE = "xBankBass/Request/DeviceType";
    public static final String XPATH_RESPONSE_THRESHOLDWARNADDORDELETE = "xBankBass/Response/ThresholdWarnAddOrDelete";//0���ӡ�1ɾ��
    public static final String XPATH_REQUEST_THRESHOLDWARNMESSAGE = "xBankBass/Request/thresholdWarnMessage";
    public static final String  XPATH_REQUEST_STRQUICKCOUNTER = "xBankBass/Request/strQuickCounter";
    public static final String  XPATH_RESPONSE_STRQUICKCOUNTER = "xBankBass/Response/strQuickCounter";
    public static final String XPATH_REQUEST_THRESHOLDWARNTYPE = "xBankBass/Request/thresholdWarnType";
    public static final String XPATH_REQUEST_TELLERDEPOSITITYPEID = "xBankBass/Request/TellerDepositItypeId";
    public static final String XPATH_REQUEST_TELLERTHRESHOLDDEPOSITNUM = "xBankBass/Request/TellerThresholdDepositNum";
    public static final String XPATH_REQUEST_TELLERWITHDRAWITYPEID = "xBankBass/Request/TellerWithDrawItypeId";
    public static final String XPATH_REQUEST_TELLERTHRESHOLDWITHDRAWNUM = "xBankBass/Request/TellerThresholdWithDrawNum";
    public static final String XPATH_REQUEST_QTMDEPOSITITYPEID = "xBankBass/Request/QTMWithDepositItypeId";
    public static final String XPATH_REQUEST_QTMTHRESHOLDDEPOSITNUM = "xBankBass/Request/QTMThresholdDepositNum";
    public static final String XPATH_REQUEST_QTMWITHDRAWITYPEID = "xBankBass/Request/QTMWithDrawItypeId";
    public static final String XPATH_REQUEST_QTMTHRESHOLDWITHDRAWNUM = "xBankBass/Request/QTMThresholdWithDrawNum";
    public static final String XPATH_REQUEST_QTMWITHDRAWWARNITYPEID = "xBankBass/Request/QTMWithDrawWarnItypeId";
    public static final String XPATH_REQUEST_QTMTHRESHOLDWITHDRAWWARNNUM = "xBankBass/Request/QTMThresholdWithDrawWarnNum";
    public static final String XPATH_REQUEST_JUDGETYPE = "xBankBass/Request/JudgeType";
    public static final String XPATH_REQUEST_ISERVICESSTATUS = "xBankBass/Request/Iservicesstatus";
    public static final String XPATH_REQUEST_IFRONTSTATUS = "xBankBass/Request/Ifrontstatus";
    public static final String XPATH_REQUEST_EXCEPTIONID = "xBankBass/Request/ExceptionId";
    public static final String XPATH_REQUEST_STRSNLOGID = "xBankBass/Request/Strsnlogid";
    public static final String XPATH_RESPONSE_CASHDRAWERMONEY = "xBankBass/Response/CashDrawerMoney";
    public static final String XPATH_RESPONSE_TELLERTHRESHOLDDEPOSITNUM = "xBankBass/Response/TellerThresholdDepositNum";
    public static final String XPATH_RESPONSE_TELLERTHRESHOLDWITHDRAWNUM = "xBankBass/Response/TellerThresholdWithDrawNum";
    public static final String XPATH_RESPONSE_QTMTHRESHOLDDEPOSITNUM = "xBankBass/Response/QTMThresholdDepositNum";
    public static final String XPATH_RESPONSE_QTMTHRESHOLDWITHDRAWNUM = "xBankBass/Response/QTMThresholdWithDrawNum";
    public static final String XPATH_RESPONSE_QTMTHRESHOLDWITHDRAWWARNNUM = "xBankBass/Response/QTMThresholdWithDrawWarnNum";
    public static final String XPATH_REQUEST_PASSWORD = "xBankBass/Request/Password";
    public static final String XPATH_REQUEST_NEWPASSWORD = "xBankBass/Request/NewPassword";
    public static final String XPATH_REQUEST_TELLER_PASSWORD = "xBankBass/Request/Password";
    public static final String XPATH_REQUEST_OPERATOR_NUM = "xBankBass/Request/OperatorNum";
    public static final String XPATH_REQUEST_OPERATOR_PASSWORD = "xBankBass/Request/Password";
    public static final String XPATH_REQUEST_TELLER_STATUS = "xBankBass/Request/TellerStatus";
    public static final String XPATH_RESPONSE_LOGIN_STATUS = "xBankBass/Response/LoginStatus";
    public static final String XPATH_RESPONSE_LOGIN_FAILMSG = "xBankBass/Response/FailMsg";
    public static final String MSG_LOGIN_FAIL = "��Ա�Ż��������";
    public static final String XPATH_RESPONSE_LOGIN_TELLERNUM = "xBankBass/Response/TellerNum";
    public static final String XPATH_RESPONSE_LOGIN_TELLERNAME = "xBankBass/Response/TellerName";
    public static final String XPATH_RESPONSE_LOGIN_BRANCHNAME = "xBankBass/Response/BranchName";
    public static final String XPATH_RESPONSE_LOGIN_SUBBRANCHNAME = "xBankBass/Response/SubBranchName";
    public static final String XPATH_RESPONSE_LOGIN_LOGINCOUNT = "xBankBass/Response/LoginCount";
    public static final String XPATH_RESPONSE_LOGIN_LOGINSTATUS = "xBankBass/Response/LoginStatus";
    public static final String XPATH_RESPONSE_LOGIN_LOGINTIME = "xBankBass/Response/LoginTime";
    public static final String XPATH_RESPONSE_CHCEKACCOUNT_AMOUNT = "xBankBass/Response/CheckAccountAmount";
    public static final String XPATH_RESPONSE_CHCEKACCOUNT_STATUS = "xBankBass/Response/CheckAccountStatus";
    public static final String XPATH_REQUEST_OLDPASSWORD = "xBankBass/Request/OldPassword";
    public static final String XPATH_REQUEST_NEWPASSWORDCMD = "xBankBass/Request/NewPasswordCmd";
    public static final String XPATH_REQUEST_CHECKACCOUNTTYPE = "xBankBass/Request/CheckAccountType";
    public static final String XPATH_REQUEST_ACCOUNTTYPE = "xBankBass/Request/AccountType";
    public static final String XPATH_REQUEST_INACCOUNTTYPE = "xBankBass/Request/InAccountType";//ת�뿨������
    public static final String XPATH_REQUEST_CHECKACCOUNT_TOTAL = "xBankBass/Request/CheckTotalAccount";//�����ܽ��
    public static final String XPATH_REQUEST_FIELD23 = "xBankBass/Request/Field23";
    public static final String XPATH_REQUEST_FIELD55 = "xBankBass/Request/Field55";
    public static final String XPATH_REQUEST_ISINPUTACCOUNT = "xBankBass/Request/IsInputAccount";
    public static final String XPATH_REQUEST_REVERSETSN = "xBankBass/Request/ReverseTsn";
    public static final String XPATH_REQUEST_REVERSEDATE = "xBankBass/Request/ReverseDate";
    public static final String XPATH_REQUEST_TRANSCODE = "xBankBass/Request/TransCode";
    public static final String XPATH_REQUEST_REVERSETYPE = "xBankBass/Request/ReverseType";
    public static final String XPATH_REQUEST_CHECKTERMSERIALNUM = "xBankBass/Request/CheckTermSerialNum";
    public static final String XPATH_REQUEST_QTDATE = "xBankBass/Request/QtDate";
    
    // ��Ա�����ϴ��޸�ʱ��
    public static final String XPATH_RESPONSE_USINGDAY = "xBankBass/Response/UsingDay";

    // ����Ա����
    public static final String MSG_HELP_RESPONSE = "���Ժ򣬹�����Ա������Ϊ���ṩ����";

    // ���ڷ���
    public static final String XPATH_REQUEST_WINDOW_SCORE = "xBankBass/Request/Score";
    public static final String XPATH_RESPONSE_WINDOW_NODE = "xBankBass/Response/Window";
    public static final String XPATH_RESPONSE_WINDOW_NAME = "xBankBass/Response/WindowName";
    public static final String XPATH_RESPONSE_WINDOW_ID = "WindowId";
    public static final String XPATH_RESPONSE_WINDOWS_NAME = "WindowName";
    public static final String XPATH_RESPONSE_WINDOW_QUEUEID = "QueueId";
    
    //�ͻ��������۷���
    public static final String XPATH_RESPONSE_EVALUATION_NODE ="xBankBass/Response/Evaluation";
    public static final String XPATH_RESPONSE_EVALUATION_ID ="Id";
    public static final String XPATH_RESPONSE_EVALUATION_DATETIME = "datetime";
    public static final String XPATH_RESPONSE_EVALUATION_WINDOW = "window";
    public static final String XPATH_RESPONSE_EVALUATION_TELLER = "teller";
    public static final String XPATH_RESPONSE_EVALUATION_SUBBRANCH = "SubBranch";
    public static final String XPATH_REQUEST_EVALUATION_ID ="xBankBass/Request/Evaluation/Id";
    
    //�ͻ��������۷���
    public static final String XPATH_RESPONSE_TELLER_NODE ="xBankBass/Response/Teller";
    public static final String XPATH_RESPONSE_TELLER_ID ="Id";
    public static final String XPATH_RESPONSE_TELLER_NAME ="Name";
    
    // Socket��Ϣ֪ͨ����
    public static final String XPATH_REQUEST_SOCKETMSG_ID = "xBankBass/Request/SocketMsgId";
    public static final String XPATH_REQUEST_SOCKETMSG_CATEGORY = "xBankBass/Request/Category";
    public static final String XPATH_RESPONSE_SOCKETMSG = "xBankBass/Response/SocketMsg";
    public static final String XPATH_RESPONSE_SOCKETMSG_ID = "Id";
    public static final String XPATH_RESPONSE_SOCKETMSG_CONTENT = "Content";
    public static final String XPATH_RESPONSE_SOCKETMSG_TIME = "Time";
    public static final String XPATH_RESPONSE_SOCKETMSG_STATUS = "Status";
    
    //�Զ���Ա�ն˷���
    public static final String XPATH_RESPONSE_TELLERCASHERTERMS = "xBankBass/Response/TellerCasherTerms";
    public static final String XPATH_RESPONSE_TELLERCASHERTERMSTATUS = "xBankBass/Response/TellerCasherTermStatus";
    public static final String XPATH_RESPONSE_DEVICESTATUS = "xBankBass/Response/DeviceStatus";
    public static final String XPATH_RESPONSE_DEVICEALARM = "xBankBass/Response/DeviceAlarm";
    public static final String XPATH_RESPONSE_CASSUNITINFO_RECORDS = "xBankBass/Response/CassUnitInfo/Records";
    public static final String XPATH_RESPONSE_TELLERCASHER_TERMNUM = "TermNum";
    public static final String XPATH_RESPONSE_TELLERCASHER_NETADDR = "NetAddress";
    public static final String XPATH_RESPONSE_TELLERCASHER_POSITION = "Position";
    public static final String XPATH_RESPONSE_SVCSTATUS = "xBankBass/Response/SvcStatus";
    public static final String XPATH_RESPONSE_TELLERCASHER_STATUS = "Status";
    public static final String XPATH_RESPONSE_TELLERCASHER_ERRORINFO = "ErrorInfo";
    public static final String XPATH_TELLERCASHRECORD = "xBankBass/TellerCashRecord";
    public static final String XPATH_REQUEST_TELLERNOTES_TASKID = "xBankBass/Request/TellerNotes/TaskId";
    public static final String XPATH_REQUEST_TELLERNOTES_TERMNUM = "xBankBass/Request/TellerNotes/TermNum";
    public static final String XPATH_RESPONSE_TELLERNOTE = "xBankBass/Response/TellerNote";
    public static final String XPATH_RESPONSE_TELLERNOTE_CURRENCY = "Currency";
    public static final String XPATH_RESPONSE_TELLERNOTE_VALUE = "Value";
    public static final String XPATH_RESPONSE_TELLERNOTE_COUNT = "Count";
    public static final String XPATH_RESPONSE_TELLERNOTE_IN = "In";
    public static final String XPATH_RESPONSE_TELLERNOTE_OUT = "Out";
    public static final String XPATH_RESPONSE_COMPLETED = "xBankBass/Response/Completed";
    public static final String XPATH_RESPONSE_INCOMPLETED = "xBankBass/Response/Incompleted";
    public static final String XPATH_RESPONSE_TASK = "Task";
    public static final String XPATH_RESPONSE_TELLERNOTES_TYPE = "TellerNotes/Type";
    public static final String XPATH_RESPONSE_TELLERNOTES_TASKID = "TellerNotes/TaskId";
    public static final String XPATH_RESPONSE_TELLERNOTES_TERMNUM = "TellerNotes/TermNum";
    public static final String XPATH_RESPONSE_TELLERNOTES_AMOUNT = "TellerNotes/Amount";
    public static final String XPATH_RESPONSE_TELLERNOTES_DATETIME = "TellerNotes/DateTime";
    public static final String XPATH_RESPONSE_TELLERNOTES = "TellerNotes";
    public static final String XPATH_RESPONSE_TELLERNOTESTASKID = "xBankBass/Response/TellerNotesTaskId";
    public static final String MODULENAME_SVCSTATUS = "SvcStatus";
    public static final String MODULENAME_COMMSTATUS = "CommStatus";
    public static final String MODULENAME_CARDREADER = "CardReader";
    public static final String MODULENAME_PINPAD = "PinPad";
    public static final String MODULENAME_CASHACCEPTOR = "CashAcceptor";
    public static final String MODULENAME_CASHDISPENSER = "CashDispenser";
    public static final int TC_RECORD_COMPLETED = 1;            //��������ɱ�־
    public static final int TC_RECORD_INCOMPLETED = 0;          //����δ��ɱ�־
    public static final String TC_RECORD_MAXCOUNT = "30";       //���񷵻�ȱʡ����¼��
    public static final String XPATH_REQUEST_CASHDRAWER = "xBankBass/Request/CashDrawer";
    public static final String XPATH_REQUEST_CASHDRAWER_TERMNUM = "xBankBass/Request/CashDrawer/TermNum";
    public static final String XPATH_REQUEST_CASHDRAWER_NOTE = "xBankBass/Request/CashDrawer/Note";
    public static final String XPATH_RESPONSE_CASHDRAWER_NOTE = "xBankBass/Response/CashDrawer/Note";
    public static final String XPATH_RESPONSE_CASHDRAWER = "xBankBass/Response/CashDrawer";
    public static final String XPATH_RESPONSE_CASHDRAWER_TERMNUM = "TermNum";
    public static final String XPATH_RESPONSE_CASHDRAWER_SINGLE_NOTE = "Note";
    public static final String XPATH_RESPONSE_AD = "xBankBass/Response/Ad";
    public static final String XPATH_RESPONSE_AD_BRANCHID = "BranchId";
    public static final String XPATH_RESPONSE_AD_SUBBRANCHID = "SubBranchId";
    public static final String XPATH_RESPONSE_AD_TERMTYPE = "TermType";
    public static final String XPATH_RESPONSE_AD_CONDITION = "Contidion";
    public static final String XPATH_RESPONSE_AD_FILETYPE = "FileType";
    public static final String XPATH_RESPONSE_AD_FILEURL = "FileUrl";
    public static final String XPATH_RESPONSE_SERVERSTATUS = "xBankBass/Response/ServerStatus";
    public static final String XPATH_RESPONSE_QUEUEITEM_FOUND = "xBankBass/Response/QueueItemFound";
    public static final String XPATH_RESPONSE_CASHDRAWERTOTALMONEY = "xBankBass/Response/CashDrawerTotalMoney";
    public static final String XPATH_RESPONSE_CASSUNITTOTALMONEY = "xBankBass/Response/CassUnitTotalMoney";
    public static final String XPATH_RESPONSE_MODULENAME = "ModuleName";
    public static final String XPATH_RESPONSE_MODULESTATUS = "Status";
    public static final String XPATH_RESPONSE_ERRORINFO = "ErrorInfo";
    public static final String XPATH_RESPONSE_ALARMLEVEL = "AlarmLevel";
    public static final String XPATH_RESPONSE_CHECKTRANSACTIONSTATUS = "xBankBass/Response/CheckTransactionStatus";
    public static final String XPATH_RESPONSE_DTSTARTTIME = "xBankBass/Response/Dtstarttime";
    public static final String XPATH_RESPONSE_STRTSNUM = "xBankBass/Response/Strtsnum";
    public static final String XPATH_RESPONSE_STRTERMNUM = "xBankBass/Response/Strtermnum";
    public static final String XPATH_RESPONSE_IAMOUNT = "xBankBass/Response/Iamount";
    public static final String XPATH_RESPONSE_STRCURRENCYCODE = "xBankBass/Response/Strcurrencycode";
    public static final String XPATH_RESPONSE_STRTELLERNUM = "xBankBass/Response/Strtellernum";
    public static final String XPATH_RESPONSE_SERVICEMODE = "xBankBass/Response/servicemode";
    public static final String XPATH_RESPONSE_WINDOWNUM = "xBankBass/Response/windownum";
    
    // �н�����
    public static final String XPATH_REQUEST_BONUSCURID = "xBankBass/Request/BonusCurId";
    public static final String XPATH_REQUEST_MOBILENUM = "xBankBass/Request/MobileNum";
    
    /**
     * �Զ�����
     */
    public static final String XPATH_REQUEST_SYSTEMNAME = "xBankBass/Request/SystemName";
    public static final String XPATH_REQUEST_CLIENTVERSION = "xBankBass/Request/ClientVersion";
    public static final String XPATH_RESPONSE_SYSTEMVERSION = "xBankBass/Response/SystemVersion";
    public static final String XPATH_RESPONSE_SYSTEMVERSION_SYSTEMNAME = "SystemName";
    public static final String XPATH_RESPONSE_SYSTEMVERSION_VERSION = "Version";
    public static final String XPATH_RESPONSE_SYSTEMVERSION_VERSIONDESC = "VersionDesc";
    public static final String XPATH_RESPONSE_SYSTEMVERSION_REBOOT = "Reboot";
    public static final String XPATH_RESPONSE_SYSTEMVERSION_FTPSERVER = "FtpServer";
    public static final String XPATH_RESPONSE_SYSTEMVERSION_FTPSERVER_IP = "IP";
    public static final String XPATH_RESPONSE_SYSTEMVERSION_FTPSERVER_PORT = "Port";
    public static final String XPATH_RESPONSE_SYSTEMVERSION_FTPSERVER_USER = "User";
    public static final String XPATH_RESPONSE_SYSTEMVERSION_FTPSERVER_PASSWORD = "Password";
    public static final String XPATH_RESPONSE_SYSTEMVERSION_FILE = "File";
    public static final String XPATH_RESPONSE_SYSTEMVERSION_FILE_CLIENTFILEFULLPATH = "ClientFileFullPath";
    public static final String XPATH_RESPONSE_SYSTEMVERSION_FILE_SERVERFILEFULLPATH = "ServerFileFullPath";
    public static final String XPATH_RESPONSE_SYSTEMVERSION_FILE_VERSION = "Version";
    public static final String XPATH_RESPONSE_SYSTEMVERSION_FILE_MD5 = "Md5";
    public static final String XPATH_RESPONSE_SYSTEMVERSION_FILE_GROUP = "Group";
    
    //�ն˴��󱨸�
    public static final String XPATH_REQUEST_ERRORINFO = "xBankBass/Request/ErrorInfo";
    public static final String XPATH_REQUEST_IMAGEFILENAME = "xBankBass/Request/ImageFileName";
    public static final String IMAGE_FILE_PATH = "/usr/hiaward/log/bass";
    public static final String IMAGE_FILE_NAME = "ErrorInfo.log";

    //��������
    public static final String CURRENCY_TYPE_RMB = "RMB";               //��������--�����
    
    //PDAҳ������
    public static final int PDA_MAX_PAGE_RECORD = 6;                    //ÿҳ��ʾ������¼��
    public static final String PDA_MSG_NOT_READ_COLOR = "red";          //δ����Ϣ��ʾ��ɫ
    public static final String PDA_MSG_READED_COLOR = "black";          //������Ϣ��ʾ��ɫ
    public static final String PDA_FONT_BLACK_COLOR = "#000";                //PDA��ť�����ɫ����
    public static final String PDA_FONT_GREY_COLOR = "#999";                 //PDA��ť�����ɫ����
    
    // �Զ���Ա���ɻ��澯����
    public static String TELLERCASH_ALARM_HIGH = "0";
    public static String TELLERCASH_ALARM_NORMAL = "1";
    public static String TELLERCASH_ALARM_LOW = "2";
    
    // �Զ���Ա���ɻ�ģ�����뱨�������Ӧ��ϵ����
    public static String ARRAY_VMODULE_ALARMLEVEL[][] = {
                                    new String[]{"SvcStatus","����״̬",TELLERCASH_ALARM_HIGH},
                                    new String[]{"CommStatus","ͨѶ״̬",TELLERCASH_ALARM_HIGH},
                                    new String[]{"CardReader","ˢ��������",TELLERCASH_ALARM_NORMAL},
                                    new String[]{"IDReader","�������֤�Ķ���",TELLERCASH_ALARM_NORMAL},
                                    new String[]{"PinPad","�������",TELLERCASH_ALARM_NORMAL},
                                    new String[]{"CashAcceptor","���ģ��",TELLERCASH_ALARM_NORMAL},
                                    new String[]{"CashDispenser","ȡ��ģ��",TELLERCASH_ALARM_NORMAL},
                                    new String[]{"Scanner","ɨ����",TELLERCASH_ALARM_NORMAL},
                                    new String[]{"ReceiptPrinter","ƾ����ӡ��",TELLERCASH_ALARM_NORMAL},
                                    new String[]{"CredencePrinter","ƾ֤��ӡ��",TELLERCASH_ALARM_NORMAL},
                                    new String[]{"CashDrawer","��Ǯ��",TELLERCASH_ALARM_NORMAL},
                                    new String[]{"CassUnit","����",TELLERCASH_ALARM_LOW}
                                    };
    // �ն��豸״̬��ʶ����
    public static String devStatus[][] = {
    	{"SVCSTATUS_IDLE","0"},							// �豸����
    	{"SVCSTATUS_OK","7"},							// �豸����
    	{"SVCSTATUS_INSERVICE","1"},					// �ͻ�������
    	{"SVCSTATUS_PAUSEBYDEV","2"},					// Ӳ������ֹͣ����
    	{"SVCSTATUS_PAUSEBYMGR","3"},					// ��������ֹͣ����
    	{"SVCSTATUS_INMAINTENANCE","4"},				// ����Աά����
    	{"SVCSTATUS_POWEROFF","5"},						// �ѹػ�
    	{"SVCSTATUS_PAUSEBYEXHAUST","6"},				// �Ĳľ�ֹͣ����
    	{"SVCSTATUS_PAUSED","8"}						// �豸ͣ��
    };


// ��������� ���������
public static String XPATH_RESPONSE_VIEWCYCLE_SETTLECYCLE = "xBankBass/Response/ViewCycle/SettleCycle";
public static String XPATH_RESPONSE_VIEWCYCLE_CWDSUCCESS_CNT = "xBankBass/Response/ViewCycle/CWDSuccess/Cnt";
public static String XPATH_RESPONSE_VIEWCYCLE_CWDSUCCESS_AMT = "xBankBass/Response/ViewCycle/CWDSuccess/Amt";
public static String XPATH_RESPONSE_VIEWCYCLE_CWDEXTRA_CNT = "xBankBass/Response/ViewCycle/CWDExtra/Cnt";
public static String XPATH_RESPONSE_VIEWCYCLE_CWDEXTRA_AMT = "xBankBass/Response/ViewCycle/CWDExtra/Amt";
public static String XPATH_RESPONSE_VIEWCYCLE_CWDUNCERTAIN_CNT = "xBankBass/Response/ViewCycle/CWDUncertain/Cnt";
public static String XPATH_RESPONSE_VIEWCYCLE_CWDUNCERTAIN_AMT = "xBankBass/Response/ViewCycle/CWDUncertain/Amt";
public static String XPATH_RESPONSE_VIEWCYCLE_CWDEXTRADONE_CNT = "xBankBass/Response/ViewCycle/CWDExtraDone/Cnt";
public static String XPATH_RESPONSE_VIEWCYCLE_CWDEXTRADONE_AMT = "xBankBass/Response/ViewCycle/CWDExtraDone/Amt";
public static String XPATH_RESPONSE_VIEWCYCLE_CWDUNCERTAINDONE_CNT = "xBankBass/Response/ViewCycle/CWDUncertainDone/Cnt";
public static String XPATH_RESPONSE_VIEWCYCLE_CWDUNCERTAINDONE_AMT = "xBankBass/Response/ViewCycle/CWDUncertainDone/Amt";
public static String XPATH_RESPONSE_VIEWCYCLE_DEPSUCCESS_CNT = "xBankBass/Response/ViewCycle/DEPSuccess/Cnt";
public static String XPATH_RESPONSE_VIEWCYCLE_DEPSUCCESS_AMT = "xBankBass/Response/ViewCycle/DEPSuccess/Amt";
public static String XPATH_RESPONSE_VIEWCYCLE_DEPUNCERTAIN_CNT = "xBankBass/Response/ViewCycle/DEPUncertain/Cnt";
public static String XPATH_RESPONSE_VIEWCYCLE_DEPUNCERTAIN_AMT = "xBankBass/Response/ViewCycle/DEPUncertain/Amt";
public static String XPATH_RESPONSE_VIEWCYCLE_DEPUNCERTAINDONE_CNT = "xBankBass/Response/ViewCycle/DEPUncertainDone/Cnt";
public static String XPATH_RESPONSE_VIEWCYCLE_DEPUNCERTAINDONE_AMT = "xBankBass/Response/ViewCycle/DEPUncertainDone/Amt";

public static String XPATH_RESPONSE_SETTLECYCLE = "xBankBass/Response/SettleCycle";
//�����ն���ˮ��
public static final String XPATH_RESPONSE_SCENARIOJOURNALNUM = "xBankBass/Response/ScenarioJournalNum"; 
public static final String XPATH_REQUEST_SCENARIOJOURNALNUM = "xBankBass/Request/ScenarioJournalNum"; 



// 2010-9-13 zhouhui ,���̿�
public static final String XPATH_REQUEST_EXPHANDLE_CASENUM = "xBankBass/Request/ExpHandle/CaseNum";
public static final String XPATH_REQUEST_EXPHANDLE_AMOUNT = "xBankBass/Request/ExpHandle/Amount";
public static final String XPATH_REQUEST_EXPHANDLE_CURRENCY = "xBankBass/Request/ExpHandle/Currency";
public static final String XPATH_REQUEST_EXPHANDLE_FLAG = "xBankBass/Request/ExpHandle/Flag";
public static final String XPATH_REQUEST_EXPHANDLE_TYPE = "xBankBass/Request/ExpHandle/Type";
public static final String XPATH_REQUEST_EXPHANDLE_MEMO = "xBankBass/Request/ExpHandle/Memo";
public static final String XPATH_REQUEST_EXPHANDLE_ID = "xBankBass/Request/ExpHandle/Id";
public static final String XPATH_REQUEST_EXPHANDLE_TASKID = "xBankBass/Request/ExpHandle/TaskId";
public static final String XPATH_REQUEST_EXPHANDLE_TERMNUM = "xBankBass/Request/ExpHandle/TermNum";
    
//2010-9-14 zhouhui ,�ٱ�
public static final String XPATH_REQUEST_FORGEDNOTE = "xBankBass/Request/ForgedNote";
public static final String XPATH_REQUEST_FORGEDNOTE_CASENUM = "xBankBass/Request/ForgedNote/CaseNum";
public static final String XPATH_REQUEST_FORGEDNOTE_AMOUNT = "xBankBass/Request/ForgedNote/Amount";
public static final String XPATH_REQUEST_FORGEDNOTE_CURRENCY = "xBankBass/Request/ForgedNote/Currnecy";
public static final String XPATH_REQUEST_FORGEDNOTE_COUNT = "xBankBass/Request/ForgedNote/Count";
public static final String XPATH_REQUEST_FORGEDNOTE_TYPE = "xBankBass/Request/ForgedNote/Type";
public static final String XPATH_REQUEST_FORGEDNOTE_VERSION = "xBankBass/Request/ForgedNote/Version";
public static final String XPATH_REQUEST_FORGEDNOTE_NUMBER = "xBankBass/Request/ForgedNote/Number";
public static final String XPATH_REQUEST_FORGEDNOTE_OWNER = "xBankBass/Request/ForgedNote/Owner";
public static final String XPATH_REQUEST_FORGEDNOTE_METHOD = "xBankBass/Request/ForgedNote/Method";
public static final String XPATH_REQUEST_FORGEDNOTE_ID = "xBankBass/Request/ForgedNote/Id";
public static final String XPATH_REQUEST_FORGEDNOTE_STATUS = "xBankBass/Request/ForgedNote/Status";

//2010-9-14  ,β��
public static final String XPATH_REQUEST_TELLERCASE_TELLERNUM = "xBankBass/Request/TellerCase/TellerNum";
public static final String XPATH_REQUEST_TELLERCASE_PASSWORD = "xBankBass/Request/TellerCase/Password";
public static final String XPATH_REQUEST_TELLERCASE_BRANCHNUM = "xBankBass/Request/TellerCase/BranchNum";
public static final String XPATH_REQUEST_TELLERCASE_CASENUMBER = "xBankBass/Request/TellerCase/CaseNumber";

//2010-9-14  ,β��
public static final String XPATH_RESPONSE_TELLERCASE_STATUS=  "xBankBass/Response/TellerCase/Status";
//add by buxishuan ��Աβ����
public static final String XPATH_RESPONSE_TELLERCASE_NUMBER=  "xBankBass/Response/TellerCase/Number";

public static final String XPATH_RESPONSE_TELLERCASEDETAIL_CASH = "xBankBass/Response/TellerCase/Cash";
public static final String XPATH_RESPONSE_TELLERCASEDETAIL_VOUCH= "xBankBass/Response/TellerCase/Vouch";
public static final String XPATH_RESPONSE_TELLERCASEDETAIL_IMPORTANCE= "xBankBass/Response/TellerCase/Importance";
public static final String XPATH_RESPONSE_TELLERCASEDETAIL_NAME = "name";
public static final String XPATH_RESPONSE_TELLERCASEDETAIL_COUNT = "count";
public static final String XPATH_RESPONSE_TELLERCASEDETAIL_LIMIT= "limit";

//��Ա���Ӱ�  add caoyifeng
public static final String XPATH_REQUEST_SURRENDERTELLERNUM = "xBankBass/Request/ChangeTeller/tellerNum/out";
public static final String XPATH_REQUEST_CHANGETELLER_TELLERNUM = "xBankBass/MessageHead/TermNum";
public static final String XPATH_REQUEST_RECEIVERTELLERNUM = "xBankBass/Request/ChangeTeller/tellerNum/in";
public static final String XPATH_REQUEST_REMARKTEXT= "xBankBass/Request/ChangeTeller/remark";
public static final String XPATH_REQUEST_CHANGETELLER_TYPE = "xBankBass/Request/ChangeTeller/Type";
public static final String XPATH_REQUEST_CHANGETELLER_DATETIME = "xBankBass/Request/ChangeTeller/DateTime";
public static final String XPATH_REQUEST_CHANGETELLER_TASKID = "xBankBass/Request/ChangeTeller/TaskId";
public static final String XPATH_REQUEST_CHANGETELLER_REMARKTEXT2 = "xBankBass/Request/ChangeTeller/RemarkText2";
public static final String XPATH_REQUEST_CHANGETELLER = "xBankBass/Request/ChangeTeller";
public static final String XPATH_REQUEST_CHANGETELLER_TERMNUM = "xBankBass/Request/ChangeTeller/TermNum";
//add by xuchunfeng ��Ա��ɫ
public static final String XPATH_REQUEST_ROLEMANAGE_ID = "xBankBass/Request/RoleManage/ID";
public static final String XPATH_REQUEST_ROLEMANAGE_NUMBER = "xBankBass/Request/RoleManage/Number";
public static final String XPATH_REQUEST_ROLEMANAGE_NAME = "xBankBass/Request/RoleManage/Name";
public static final String XPATH_REQUEST_ROLEMANAGE_STARTTIME = "xBankBass/Request/RoleManage/Starttime";
public static final String XPATH_REQUEST_ROLEMANAGE_ENDTIME = "xBankBass/Request/RoleManage/Endtime";
public static final String XPATH_REQUEST_ROLEMANAGE_CREATER = "xBankBass/Request/RoleManage/Creater";
public static final String XPATH_REQUEST_ROLEMANAGE_CREATIONTIME = "xBankBass/Request/RoleManage/Creationtime";
public static final String XPATH_REQUEST_ROLEMANAGE_STATE = "xBankBass/Request/RoleManage/State";
public static final String XPATH_REQUEST_ROLEMANAGE_DESCRIPTION = "xBankBass/Request/RoleManage/Description";
public static final String XPATH_REQUEST_ROLEMANAGE_OPERATETYPE = "xBankBass/Request/RoleManage/OperateType";
public static final String XPATH_REQUEST_ROLEMANAGE_RETURNSTATE = "xBankBass/Request/RoleManage/ReturnState";


//add by xuchunfeng ��Ա����
public static final String XPATH_REQUEST_TELLER_ID = "xBankBass/Request/Teller/ID";
public static final String XPATH_REQUEST_TELLER_NUMBER = "xBankBass/Request/Teller/TellerNum";
public static final String XPATH_REQUEST_TELLER_NAME = "xBankBass/Request/Teller/TellerName";
public static final String XPATH_REQUEST_TELLER_BRANCHNUM = "xBankBass/Request/Teller/BranchNum";
public static final String XPATH_REQUEST_TELLER_SUBBRANCHNUM = "xBankBass/Request/Teller/SubBranchNum";
public static final String XPATH_REQUEST_TELLER_STRPASSWORD = "xBankBass/Request/Teller/PassWord";
public static final String XPATH_REQUEST_TELLER_DEPARTMENTNAME = "xBankBass/Request/Teller/DepartmentName";
public static final String XPATH_REQUEST_TELLER_TELEPHONE = "xBankBass/Request/Teller/Telephone";
public static final String XPATH_REQUEST_TELLER_EMAIL = "xBankBass/Request/Teller/Email";
public static final String XPATH_REQUEST_TELLER_LOGINSTATUS = "xBankBass/Request/Teller/LoginStatus";
public static final String XPATH_REQUEST_TELLER_LOGINCOUNT = "xBankBass/Request/Teller/LoginCount";
public static final String XPATH_REQUEST_TELLER_LOGINTIME = "xBankBass/Request/Teller/LoginTime";
public static final String XPATH_REQUEST_TELLER_TYPE = "xBankBass/Request/Teller/Type";
public static final String XPATH_REQUEST_TELLER_DTCHANGEPWD = "xBankBass/Request/Teller/DtChangePwd";
public static final String XPATH_REQUEST_TELLER_CHECKACCOUNTSTATUS = "xBankBass/Request/Teller/CheckAccountStatus";
public static final String XPATH_REQUEST_TELLER_OPERATETYPE = "xBankBass/Request/Teller/OperateType";
public static final String XPATH_REQUEST_TELLER_RETURNSTATE = "xBankBass/Request/Teller/ReturnState";
public static final String XPATH_REQUEST_TELLER_ROLENAMES = "xBankBass/Request/Teller/RoleNames";
//add by xuchunfeng ͬ����Ա��Ϣ
public static final String  XPATH_REQUEST_TELLERNAME="xBankBass/Request/TellerName";
public static final String  XPATH_REQUEST_TELLERNUMBER="xBankBass/Request/TellerNumber";
public static final String XPATH_REQUEST_BUSINESSWATER = "xBankBass/Request/BusinessWater";
//add by yanjifu 
public static final String  XPATH_REQUEST_TELLERSTATUS="xBankBass/Request/TellerStatus";
//2011-10-25 ������ˮ�� add by ouwanjun
public static final String XPATH_REQUEST_BUYTYPE = "xBankBass/Request/BuyType";
public static final String XPATH_REQUEST_DTOCCUR = "xBankBass/Request/DtocCur";
public static final String XPATH_REQUEST_ACCOUNTNUM = "xBankBass/Request/AccountNum";
public static final String XPATH_REQUEST_MONEYAMOUNT = "xBankBass/Request/MoneyAmount";


//2012-06-04 �ֽ����  add by wwl
public static final String XPATH_REQUEST_CASHMIXPAY_TRADETYPE = "xBankBass/Request/bytype" ;
public static final String XPATH_REQUEST_CASHMIXPAY_OTHERSJGM = "xBankBass/Request/othersjgm" ;
public static final String XPATH_REQUEST_CASHMIXPAY_DTOCCUR = "xBankBass/Request/dtoccur" ;
public static final String XPATH_REQUEST_CASHMIXPAY_DOCTSTOCKET = "xBankBass/Request/doctStocket" ;
public static final String XPATH_REQUEST_CASHMIXPAY_CARDNUM = "xBankBass/Request/cardNum";
public static final String XPATH_REQUEST_CASHMIXPAY_IMTYPE = "xBankBass/Request/cardNum/imtype" ;
public static final String XPATH_REQUEST_CASHMIXPAY_ISPREAD = "xBankBass/Request/cardNum/ispread" ;
public static final String XPATH_REQUEST_CASHMIXPAY_IPARVEL = "xBankBass/Request/cardNum/iparvel" ;
public static final String XPATH_REQUEST_CASHMIXPAY_IRKAMOUNT = "xBankBass/Request/cardNum/irkamount" ;

public static final String XPATH_REQUEST_CASHMIXPAY_BYTYPE = "xBankBass/Request/cashmixpay/byType" ;
public static final String XPATH_REQUEST_CASHMIXPAY_OTHERSTELLER= "xBankBass/Request/cashmixpay/OthersTeller" ;
public static final String XPATH_REQUEST_CASHMIXPAY_DTOCCURS = "xBankBass/Request/cashmixpay/dtocCur" ;

//�ؿ�ƾ֤����
public static final String XPATH_REQUEST_VOUCHER_BYTYPE = "xBankBass/Request/bytype";
public static final String XPATH_REQUEST_VOUCHER_TEXTDATE = "xBankBass/Request/workdate";
public static final String XPATH_REQUEST_VOUCHER_TRANSTEL ="xBankBass/Request/strtranstel";
public static final String XPATH_REQUEST_VOUCHER_TELLER ="xBankBass/Request/teller";
public static final String XPATH_REQUEST_VOUCHER_INCTELLER ="xBankBass/Request/incteller";
public static final String XPATH_REQUEST_VOUCHER_STATUS = "xBankBass/Request/status";
public static final String XPATH_REQUEST_VOUCHER_BYTYPR = "";
public static final String XPATH_REQUEST_VOUCHER_VTYPE = "";
public static final String XPATH_REQUEST_VOUCHER_VOUTYPE = "";
public static final String XPATH_REQUEST_VOUCHER_CALBREAD = "";
public static final String XPATH_REQUEST_VOUCHER_CALTYPE = "";
public static final String XPATH_REQUEST_VOUCHER_CALNAME = "";
public static final String XPATH_REQUEST_VOUCHER_INUMBUP = "";
public static final String XPATH_REQUEST_VOUCHER_INUMDOWN ="";
public static final String XPATH_REQUEST_VOUCHER_INUMBER = "";
public static final String XPATH_REQUEST_VOUCHER_IBLOCK = "";
public static final String XPATH_REQUEST_VOUCHER_STOPDATE = "";

//�ճ��ӳ�����
public static final String XPATH_REQUEST_TERMPLUS_TERMUNM = "xBankBass/Request/termplus/termnum";
public static final String XPATH_REQUEST_TERMPLUS_ICPETELL = "xBankBass/Request/termplus/icpetell";
public static final String XPATH_REQUEST_TERMPLUS_ICPETENAME = "xBankBass/Request/termplus/icpeteName";
public static final String XPATH_REQUEST_TERMPLUS_WORKDATE = "xBankBass/Request/termplus/workdate";
public static final String XPATH_REQUEST_TERMPLUS_TELLER = "xBankBass/Request/termplus/teller";
public static final String XPATH_REQUEST_TERMPLUS_TOLTER = "xBankBass/Request/termplus/tolter";
public static final String XPATH_REQUEST_TERMPLUS_CASA = "xBankBass/Request/termplus/casA";
public static final String XPATH_REQUEST_TERMPLUS_CASB = "xBankBass/Request/termplus/casB";
public static final String XPATH_REQUEST_TERMPLUS_CASC = "xBankBass/Request/termplus/casC";
public static final String XPATH_REQUEST_TERMPLUS_CASD = "xBankBass/Request/termplus/casD";
public static final String XPATH_REQUEST_TERMPLUS_FIFTY = "xBankBass/Request/termplus/Fifty";
public static final String XPATH_REQUEST_TERMPLUS_HUNDRED = "xBankBass/Request/termplus/Hundred";
public static final String XPATH_REQUEST_TERMPLUS_TWENTY = "xBankBass/Request/termplus/Twenty";
public static final String XPATH_REQUEST_TERMPLUS_TEN = "xBankBass/Request/termplus/Ten";
public static final String XPATH_REQUEST_TERMPLUS_FIVE = "xBankBass/Request/termplus/Five";
public static final String XPATH_REQUEST_TERMPLUS_ONE = "xBankBass/Request/termplus/one";
public static final String XPATH_REQUEST_TERMPLUS_TWO = "xBankBass/Request/termplus/Two";
public static final String XPATH_REQUEST_TERMPLUS_ZFIVE = "xBankBass/Request/termplus/zFive";
public static final String XPATH_REQUEST_TERMPLUS_ZONE = "xBankBass/Request/termplus/zone";
public static final String XPATH_REQUEST_TERMPLUS_FIVEZERO = "xBankBass/Request/termplus/fiveZero";
public static final String XPATH_REQUEST_TERMPLUS_ONEZERO = "xBankBass/Request/termplus/oneZero";
public static final String XPATH_REQUEST_TERMPLUS_ZEROMONEY = "xBankBass/Request/termplus/zeromoney";
public static final String XPATH_REQUEST_TERMPLUS_CASAVAL = "xBankBass/Request/termplus/casaVal";
public static final String XPATH_REQUEST_TERMPLUS_CASBVAL = "xBankBass/Request/termplus/casbVal";
public static final String XPATH_REQUEST_TERMPLUS_CASCVAL = "xBankBass/Request/termplus/cascVal";
public static final String XPATH_REQUEST_TERMPLUS_CASDVAL = "xBankBass/Request/termplus/casdVal";


//2011-12-02 ������� add by ouwanjun
public static final String XPATH_REQUEST_TELLERNUM = "xBankBass/Request/TellerNum";
public static final String XPATH_REQUEST_CheckAccountType = "xBankBass/Request/CheckAccountType";
public static final String XPATH_REQUEST_DTBEGIN = "xBankBass/Request/DtBegin";
public static final String XPATH_REQUEST_DTEND = "xBankBass/Request/DtEnd";
public static final String XPATH_REQUEST_REQUESTFLAG = "xBankBass/Request/requestflag";
public static final String XPATH_REQUEST_DETAILTYPE = "xBankBass/Request/detailtype";
public static final String XPATH_REQUEST_CHECKTOTALACCONT = "xBankBass/Request/CheckTotalAccount";

// �������Ͷ��� For CITIC
public static final String PRIVATE_QUERYACCOUNT = "81";// ��ѯ���
public static final String PRIVATE_WITHDRAW = "71";// ȡ��
public static final String PRIVATE_TRANSFER_OUT = "64";// ת��ת��
public static final String PRIVATE_TRANSFER_IN_FIRST = "61";// ת��ת���һ��
public static final String PRIVATE_TRANSFER_IN_TWICE = "62";// ת��ת��ڶ���
public static final String PRIVATE_DEPOSIT = "11";// ���
public static final String PRIVATE_CHANGEPWD_FIRST = "63";// ���ܵ�һ��
public static final String PRIVATE_CHANGEPWD_TWICE = "51";// ���ܵڶ���
public static final String PRIVATE_ADDCASH = "03";//�ӳ�
public static final String PRIVATE_CLEANTERM = "08";//���
public static final String PRIVATE_GETWORKINGKEY = "09";// ���빤����Կ

// ����붨�� For CITIC
public static final String COMPCODE_SUCCESS = "0110";// �������ؽ��׳ɹ�,�豸�����ɹ�
public static final String COMPCODE_SOMETHING_LEFT = "0112";// �����ڿ���������
public static final String COMPCODE_DESPENSE_FAILED = "0121";// �ڳ�ʧ��
public static final String COMPCODE_FAILED = "0130";// ����ʧ�ܽ���,�豸�����ɹ�
public static final String COMPCODE_TIMEOUT = "0033";// ����������Ȩ��ʱ
public static final String COMPCODE_NO_REQUEST = "0030";// δ��������Ϣ��������

// ����ͨѶ������� For CITIC
public static final int EXCHANGE_SUCCESS = 0;// �����ɹ�
public static final int EXCHANGE_FAILED = 1;// ����ʧ��
public static final int EXCHANGE_UNCERTAIN = 2;// ���������ȷ��

//ͳһ��ȨͨѶ�ӿڶ���
public static final String XPATH_REQUEST_AUTHOR_PAYACCTS = "xBankBass/Request/author/payaccte";
public static final String XPATH_REQUEST_AUTHOR_ACCTNAMES = "xBankBass/Request/author/accname";
public static final String XPATH_REQUEST_AUTHOR_RADIO = "xBankBass/Request/author/radio";
public static final String XPATH_REQUEST_AUTHOR_TELPWD = "xBankBass/Request/author/password";
public static final String XPATH_REQUEST_AUTHOR_TEXTDATE = "xBankBass/Request/author/workdate";
public static final String XPATH_REQUEST_AUTHOR_TELLER = "xBankBass/Request/author/teller";
public static final String XPATH_REQUEST_AUTHOR_BUYNAME = "xBankBass/Request/author/buyname";				  //��������
public static final String XPATH_REQUEST_AUTHOR_AUTHTELL = "xBankBass/Request/author/authteller";

public static final String XPATH_AUTHORIZATION_TELLERNUM = "xBankBass/Request/Authorization/TellerNum";       //�ն˺�
public static final String XPATH_AUTHORIZATION_AMOUNT = "xBankBass/Request/Authorization/Amount";			  //���׽��
public static final String XPATH_AUTHORIZATION_NETADDR = "xBankBass/Request/Authorization/netaddr";           //��Աip��ַ
public static final String XPATH_AUTHORIZATION_DATETIME = "xBankBass/Request/Authorization/DateTime";         //����ʱ��
//add by caoyifeng ���Ӱ�
public static final String XPATH_RESPONSE_TELLEROUT = "xBankBass/Response/TermNumOut";
public static final String XPATH_RESPONSE_TELLERIN = "xBankBass/Response/TermNumIn";


//add by wwl  Ȧ��
public static final String XPATH_ACCOUNTPLAC_TERMNO= "xBankBass/AccountPlac/termno";
public static final String XPATH_ACCOUNTPLAC_PAYACCOUNT = "xBankBass/AccountPlac/payaccount";
public static final String XPATH_ACCOUNTPLAC_ICTYPE = "xBankBass/AccountPlac/ICType";
public static final String XPATH_ACCOUNTPLAC_PEYTYPE = "xBankBass/AccountPlac/peytype";
public static final String XPATH_ACCOUNTPLAC_AMOUNT = "xBankBass/AccountPlac/amount";
public static final String XPATH_ACCOUNTPLAC_PEYACCOUNT = "xBankBass/AccountPlac/peyaccount";
public static final String XPATH_ACCOUNTPLAC_ICBYSTATUS = "xBankBass/AccountPlac/ICbyStatus";
public static final String XPATH_ACCOUNTPLAC_ICDATETIME = "xBankBass/AccountPlac/ICdatetime";
public static final String XPATH_ACCOUNTPLAC_BANKNUM = "xBankBass/AccountPlac/banknum";
public static final String XPATH_ACCOUNTPLAC_TELLERNUM = "xBankBass/AccountPlac/tellernum";

//������
public static final String XPATH_REQUEST_POUNDAGE_TRANSTYPE  = "xBankBass/Request/Poundage/Transtype";
public static final String XPATH_REQUEST_POUNDAGE_CARDTYPE  = "xBankBass/Request/Poundage/CardType";
public static final String XPATH_REQUEST_POUNDAGE_CARDNUM  = "xBankBass/Request/Poundage/CardNum";
public static final String XPATH_REQUEST_POUNDAGE_CARDNUMIN = "xBankBass/Request/Poundage/CardNumIn";
public static final String XPATH_REQUEST_POUNDAGE_CARDNUMINTYPE = "xBankBass/Request/Poundage/CardNumInType";
public static final String XPATH_RESPONSE_POUNDAGE_FEEFLAG = "xBankBass/Response/Poundage/FeeFlag";

//���ڱ������
public static final String XPATH_REQUEST_WINDOWNUM = "xBankBass/Request/windownum";
public static final String XPATH_REQUEST_WINDOWIP = "xBankBass/Request/windowip";
// ���ķ���״̬
public static final String HOST_RETURN_S = "S";        // ���׳ɹ�
public static final String HOST_RETURN_E = "E";        // ����ʧ��

public static final String XPATH_REQUEST_TERMNO = "xBankBass/Request/termno";
public static final String XPATH_REQUEST_SERVICEMODE = "xBankBass/Request/servicemode";
public static final String XPATH_RESPONSE_RETURNFLAG = "xBankBass/Response/returnFlag";
public static final String XPATH_REQUEST_ISALLCHANGE = "xBankBass/Request/isAllChange";

//�������ʱ��QTMCleanCashResultȡamount,������ص�amountΪ�գ���ʾ��Ա����ж���ֽ��������¼
public static final String XPATH_RESPONSE_ISRETURNFLAG = "xBankBass/Response/isReturnFlag";
//ж���ֽ��������¼
public static final String XPATH_REQUEST_SETTLECYCLECUR = "xBankBass/Request/settleCyclecur";
public static final String XPATH_REQUEST_AMOUNTS = "xBankBass/Request/amounts";
public static final String XPATH_REQUEST_STATUS = "xBankBass/Request/status";
public static final String XPATH_REQUEST_ID = "xBankBass/Request/id";
public static final String XPATH_REQUEST_ITYPE = "xBankBass/Request/itype";
public static final String XPATH_REQUEST_STRDEALMESSAGE = "xBankBass/Request/strdealmessage";
//QTM������˵�ʱ��Ҫ��Ҫ���¹�Աβ��
public static final String XPATH_REQUEST_ISUPDATECASHDRAW = "xBankBass/Request/isupdatecashdraw";
//�쳣����
public static final String XPATH_RESPONSE_QTMEXCEPTIONRECORDS = "xBankBass/Response/qtmExceptionRecords";
public static final String XPATH_RESPONSE_BOOKINGEXCEPTIONRECORDS = "xBankBass/Response/bookingExceptionRecords";
}
