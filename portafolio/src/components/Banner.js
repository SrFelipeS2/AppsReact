import React from 'react';
import Image from '../assets/avatar.svg';
import { FaGithub, FaLinkedin, FaMailBulk, FaWhatsapp } from 'react-icons/fa';
import { TypeAnimation } from 'react-type-animation';
import { motion } from 'framer-motion';
import { fadeIn } from '../variants';
const Banner = () => {
  return <section className='min-h-[85vh] lg:min-h-[78vh] felx items-center' id='home'>
    <div className='container mx-auto'>
      <div className='flex flex-col gap-y-8 mx-auto lg:flex-row lg:items-center lg:gap-x-12'>
        {/*text */}
        <div className='flex-1 text-center font-secondary lg:text-left'>
          <motion.h1
            variants={fadeIn('up', 0.3)}
            initial="hidden"
            whileInView={'show'}
            viewport={{ once: false, amount: 0.7 }}
            className='text-[55px] font-bold leading-[0.8] lg:text-[110px]'
          >
            ANDRES <span>LOPEZ</span>
          </motion.h1>
          <motion.div
            variants={fadeIn('up', 0.4)}
            initial="hidden"
            whileInView={'show'}
            viewport={{ once: false, amount: 0.7 }}
            className='mb-6 text-[36px] lg:text-[60px] font-secondary font-semibold leading-[1]'>
            <span className='mr-2 text-white'>I'm a/an:</span>
            <TypeAnimation sequence={[
              'DEVELOPER',
              2500,
              'PASSIONATE ABOUT TECHNOLOGY',
              2500,
              'ELECTRONICS TECHNOLOGIST',
              2500,
              'HARDWARE ENTHUSIAST',
              2500,
              'INDUSTRIAL AUTOMATION TECHNOLOGIST',
              2500,
              // 'CHECK MY RESUME ON LINKEDIN!!',
              // 4500,
            ]}
              speed={50}
              className='text-accent'
              wrapper='span'
              repeat={Infinity}
            />
          </motion.div>
          < motion.p variants={fadeIn('up', 0.5)}
            initial="hidden"
            whileInView={'show'}
            viewport={{ once: false, amount: 0.7 }} className='mb-8 max-w-lg mx-auto lg:mx-0'>I am a proactive person who enjoys working in a team. I am a fast learner and believe I can be of great assistance to you. I want to emphasize my interest in being part of your team, so here I leave my contact information and personal details.</motion.p>
          <motion.div
            variants={fadeIn('up', 0.6)}
            initial="hidden"
            whileInView={'show'}
            viewport={{ once: false, amount: 0.7 }}
            className='flex max-w-max gap-x-6 items-center mb-12 mx-auto lg:mx-0'>
            <a className='py-4 btn btn-lg max-w-lg' href='https://wa.link/o4xur7'>Contact Me</a>
            <a href='https://www.linkedin.com/in/andres-lopez-1456b4235' className='text-gradient btn-link'>My Linkedin</a>
          </motion.div>
          <motion.div
            variants={fadeIn('up', 0.7)}
            initial="hidden"
            whileInView={'show'}
            viewport={{ once: false, amount: 0.7 }}
            className='flex text-[20px] gap-x-6 max-w-max mx-auto lg:mx-0'>
            <a href='https://github.com/SrFelipeS2'>
              <FaGithub />
            </a>
            <a href='https://www.linkedin.com/in/andres-lopez-1456b4235'>
              <FaLinkedin />
            </a>
            <a href='https://wa.link/o4xur7'>
              <FaWhatsapp />
            </a>
          </motion.div>
        </div>
        {/*image */}
        <motion.div
          variants={fadeIn('down', 0.5)}
          initial="hidden"
          whileInView={'show'}          
          className='hidden lg:flex flex-1 max-w-[320px] lg:max-w-[482px]'>
          <img src={Image}></img>
        </motion.div>
      </div>
    </div>
  </section>;
};

export default Banner;
