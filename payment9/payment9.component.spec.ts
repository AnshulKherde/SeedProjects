import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Payment9Component } from './payment9.component';

describe('Payment9Component', () => {
  let component: Payment9Component;
  let fixture: ComponentFixture<Payment9Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Payment9Component]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(Payment9Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
