package kr.yjc.jclass;

public interface Iterator {
	public boolean hasNext(); //아직 조회할 요소가 있는가?
	public Object next(); //다음 요소 가져오기(다음에 올 요소 형태를 모르므로 다형성을 이용해 오브젝트로 받음.)
	public Object remove(); //삭제하면서 삭제한 요소 가져오기
}
