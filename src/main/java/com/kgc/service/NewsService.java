package com.kgc.service;

import java.util.List;

import com.kgc.pojo.News;

public interface NewsService {
	// ��ѯ������Ϣ
	public List<News> getNewsList();
	
	// ����������Ϣ
	public boolean add(News news) ;
}
