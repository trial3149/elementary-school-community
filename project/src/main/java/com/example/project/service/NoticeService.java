package com.example.project.service;

import com.example.project.dto.SearchDto;
import com.example.project.dto.notice.NoticeDto;

import org.springframework.stereotype.Service;
import com.example.project.mapper.NoticeMapper;

import java.util.List;

@Service
public class NoticeService {

    final NoticeMapper noticeMapper;

    public NoticeService(final NoticeMapper noticeMapper) {
        this.noticeMapper = noticeMapper;
    }
    
    public List<NoticeDto> selectNoticieList() {
        return noticeMapper.selectNoticeList();
    }
    
    public Integer insertNotice(final NoticeDto noticeDto) {
    	return noticeMapper.insertNotice(noticeDto);
    }
    public int deleteNotice(Long postId) {
    	return noticeMapper.deleteNotice(postId);
    }
    
    public NoticeDto selectByPostId(int postId) {
    	return noticeMapper.selectByPostId(postId);
    }
    public Integer updateNotice(final NoticeDto noticeDto) {
    	return noticeMapper.updateNotice(noticeDto);
    }

}
