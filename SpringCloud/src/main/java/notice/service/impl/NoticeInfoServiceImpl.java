package notice.service.impl;

import notice.entity.NoticeInfo;
import notice.mapper.NoticeInfoMapper;
import notice.service.INoticeInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 通知记录表 服务实现类
 * </p>
 *
 * @author Lyh
 * @since 2021-05-31
 */
@Service
public class NoticeInfoServiceImpl extends ServiceImpl<NoticeInfoMapper, NoticeInfo> implements INoticeInfoService {

}