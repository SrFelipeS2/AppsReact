import React from 'react';
import { BsArrowUpRight } from 'react-icons/bs'
import { motion } from 'framer-motion'
import { fadeIn } from '../variants'
import Img1 from '../assets/portfolio-img1.png';
import Img2 from '../assets/portfolio-img2.png';
import Img3 from '../assets/portfolio-img3.png';


const Work = () => {
  return (
    <section className='section' id='work'>
      <div className='container mx-auto'>
        <div className='flex flex-col lg:flex-row gap-x-10'>
          <motion.div
          variants={fadeIn('right', 0.2)}
          initial="hidden"
          whileInView={'show'}
          viewport={{ once: false, amount: 0.3 }}
          className='flex-1 flex flex-col gap-y-10 mb-10 lg:mb-0'>
            {/*text*/}
            <div>
              <h2 className='h2 leading-tight text-accent'>
                my Latest <br /> Work
              </h2>
              <p className='max-w-sm mb-10'>In my previous role as a software developer at BPMco, I applied my expertise as a technologist in computer systems analysis and development. I effectively managed complex databases, utilized advanced programming languages and paradigms, and successfully led a project for Guatemala. This project involved direct client interaction, requirement gathering, and tailored platform implementation. My contribution was recognized upon departure for exceeding expectations and making a positive impact..</p>
              <button className='btn btn-sm'>View all projects</button>
            </div>     
          </motion.div>
          <motion.div
            variants={fadeIn('left', 0.2)}
            initial="hidden"
            whileInView={'show'}
            viewport={{ once: false, amount: 0.3 }}
            className='flex-1 flex flex-col gap-y-10 lg:mt-[105px] xl:mt-10 sm:mt[105px]'>
            {/*image*/}
            <div className='group relative overflow-hidden border-2 border-white/50 rounded-xl'>
              {/*overlay*/}
              <div className='group-hover:bg-black/70 w-full h-full absolute z-40 transition-all duration-300'></div>
              {/*img*/}
              <img className='group-hover:scale-125 transition-all duration-500' src={Img2} alt='' />
              {/*pretitle */}
              <div className='absolute -bottom-full left-12 group-hover:bottom-24 transition-all duration-500 z-50'>
                <span className='text-gradient'>Ui/Ux design</span>
              </div>
              {/*title*/}
              <div className='absolute -bottom-full left-12 group-hover:bottom-14 transition-all duration-700 z-50'>
                <span className='text-3xl text-white'>project Title</span>
              </div>
            </div>        
          </motion.div>
        </div>
      </div>
    </section>
  )
};

export default Work;
