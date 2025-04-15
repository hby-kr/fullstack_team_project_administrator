package com.artu.fullstack_team_project_administrator.service.events;

import com.artu.fullstack_team_project_administrator.dto.Event;

import java.util.List;

public interface EventService {

    // 관리자 승인 못받은 공연 찾기
    List<Event> findAllEvents();

    // 관리자 승인 못받은 공연 활성화 (is_approved)
    boolean modifyIsApproved(Event event);

    // 활성화 공연정보 불러오기
    List<Event> findActiveEvents();

    // 비활성화된 공연정보 불러오기 (is_used)
    List<Event> findInactiveEvents();

    // 체크된 활성화 공연정보 비활성화 시키기
    boolean modifyInactive(Event event);

    // 체크된 비활성화 공연정보 활성화 시키기 (회원이랑 같네)
    boolean modifyActive(Event event);

}
