package model

import (
	"sync"
)

type inter interface{}

type Set struct {
	m map[inter]bool
	sync.RWMutex
}

func NewSet() *Set {
	return &Set{
		m: map[inter]bool{},
	}
}
func (s *Set) Add(item inter) {
	s.Lock()
	defer s.Unlock()
	s.m[item] = true
}
func (s *Set) Remove(item inter) {
	s.Lock()
	s.Unlock()
	delete(s.m, item)
}
func (s *Set) Has(item inter) bool {
	s.RLock()
	defer s.RUnlock()
	_, ok := s.m[item]
	return ok
}
func (s *Set) Len() int {
	return len(s.List())
}
func (s *Set) Clear() {
	s.Lock()
	defer s.Unlock()
	s.m = map[inter]bool{}
}
func (s *Set) IsEmpty() bool {
	if s.Len() == 0 {
		return true
	}
	return false
}
func (s *Set) List() []inter {
	s.RLock()
	defer s.RUnlock()
	list := []inter{}
	for item := range s.m {
		list = append(list, item)
	}
	return list
}
