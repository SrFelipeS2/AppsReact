import React from 'react';

import Logo from '../assets/logo.svg'

const Header = () => {
  return <div className='py-8'>
    <div className='container mx-auto'>
      <div className='flex justify-between intems-center'>
        { }
        <a href='#'>
          <img src={Logo} aly=''></img>
        </a>
        { }
        <a className='py-1 btn btn-sm md:py-4 text-center' href='https://wa.link/o4xur7'>Work with me</a>        
      </div>
    </div>
  </div>;
};

export default Header;
