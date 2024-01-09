package com.winter.app.util;

//DTO
public class pager {
	
	private Long startRow;
	private Long LastRow;
	
	//한 페이지에 조회할 갯수
	private Long perpage=10L;
	
	//페이지 번호, 파라미터
	private Long page;
	
	//startRow, lastRow계산
	public void makeRow() {
		this.LastRow= this.getPage()*this.getPerpage();
		this.startRow=LastRow-this.getPerpage()+1;
	}
	
	public void makeNum(){
		//1. 총 갯수로 총 페이지 수 구하기
		
		//2. 총 페이지수로 총 블럭수 구하기
		
		//3. 현재 페이지 번호로 현재 블럭 번호 구하기
		
		//4. 현재 블럭 번호로 시작번호와 끝 번호 구하기
		
		//5. 이전, 다음 블럭 유무 구하기
		
	}

	public Long getStartRow() {
		return startRow;
	}

	public void setStartRow(Long startRow) {
		this.startRow = startRow;
	}

	public Long getLastRow() {
		return LastRow;
	}

	public void setLastRow(Long lastRow) {
		LastRow = lastRow;
	}

	public Long getPerpage() {
		if(this.perpage==null || this.perpage<1) {
			this.perpage=10L;
		}
		return perpage;
	}

	public void setPerpage(Long perpage) {
		this.perpage = perpage;
	}

	public Long getPage() {
		if(this.page==null || this.page<1) {
			this.page=1L;
		}
		return page;
	}

	public void setPage(Long page) {
		this.page = page;
	}


}
